/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:56 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：双检锁
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:56 星期日
 */
public class DoubleCheckedLockingSingletonSafe {

    /**
     * 分析为什么要加volatile：
     * <p>
     * instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
     * 1.给 instance 分配内存
     * 2.调用 Singleton 的构造函数来初始化成员变量
     * 3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
     * 但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
     * <p>
     * 我们只需要将 instance 变量声明成 volatile 就可以了。
     * <p>
     * 有些人认为使用 volatile 的原因是可见性，也就是可以保证线程在本地不会存有 instance 的副本，每次都是去主内存中读取。
     * 但其实是不对的。使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化。
     * 也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前。
     * 比如上面的例子，取操作必须在执行完 1-2-3 之后或者 1-3-2 之后，不存在执行到 1-3 然后取到值的情况。
     * 从「先行发生原则」的角度理解的话，就是对于一个 volatile 变量的写操作都先行发生于后面对这个变量的读操作（这里的“后面”是时间上的先后顺序）。
     * <p>
     * 但是特别注意在 Java 5 以前的版本使用了 volatile 的双检锁还是有问题的。
     * 其原因是 Java 5 以前的 JMM （Java 内存模型）是存在缺陷的，即时将变量声明成 volatile 也不能完全避免重排序，
     * 主要是 volatile 变量前后的代码仍然存在重排序问题。这个 volatile 屏蔽重排序的问题在 Java 5 中才得以修复，
     * 所以在这之后才可以放心使用 volatile。
     */
    private volatile static DoubleCheckedLockingSingletonSafe instance;

    private DoubleCheckedLockingSingletonSafe() {
    }

    public static DoubleCheckedLockingSingletonSafe getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingletonSafe.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingletonSafe();
                }
            }
        }
        return instance;
    }
}
