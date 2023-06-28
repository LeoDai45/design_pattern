**设计原则：**

总原则: 开闭原则（对扩展开放，对修改关闭）

| 设计原则     | 归纳                                                         | 目的                                       |
| ------------ | ------------------------------------------------------------ | ------------------------------------------ |
| 开闭原则     | 对扩展开放，对修改关闭                                       | 降低维护带来的新风险                       |
| 单一职责原则 | 一个类只干一件事，实现类要单一                               | 便于理解，提高代码的可读性                 |
| 里氏替换原则 | 不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义 | 防止继承泛滥                               |
| 依赖倒置原则 | 高层不应该依赖低层，要面向接口编程                           | 更利于代码结构的升级扩展                   |
| 接口隔离原则 | 一个接口只干一件事，接口要精简单一                           | 功能解耦，高聚合、低耦合                   |
| 迪米特法则   | 不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度 | 只和朋友交流，不和陌生人说话，减少代码臃肿 |
| 合成复用原则 | 尽量使用组合或者聚合关系实现代码复用，少使用继承             | 降低代码耦合                               |

1.单一职责：

①降低类的复杂度，一个雷只负责一个职责

②提高类的可读性、可维护性

③降低类变更带来的风险

④只有类中方法足够少，可以在方法级别保持单一职责

2.接口隔离：

使用多个隔离的接口要比使用一个要好

3.依赖倒转：

①底层模块尽量都要有抽象类或接口，或者两者都有。

②变量的声明尽量是抽象类或接口

③继承时遵循里氏替换原则(set传递、构造器传递、接口传递)

4.里氏替换：
使用的基类可以在任何地方使用继承的子类，完美的替换基类

即：子类可以扩展父类的功能，但不能改变父类原有的功能。子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。子类可以增加自己特有的方法

5.迪米特：

（最少知道法则）

①一个对象应对其他对象保持最少的了解

②类与类的关系越密切，耦合（依赖、关联、组合、聚合）度越大

6.合成复用：

尽量使用合成/聚合的方式，而不是使用继承

①找出应用中可能变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起

②针对接口编程而不是针对实现编程

③为了交互对象间的松耦合而努力

**类型：**

- 创建型，描述如何创建对象

  - 定义：创建对象的模式，对类的实例化进行抽象
      - 特点：隐藏实例化过程，封装类的具体信息

- 结构型，描述如何实现类和对象的组合

  - 定义：处理类或者对象的组合

      - 类型：

        - 对象结构型：组合对象的方式来实现新功能
              
        - 类结构型：采用继承机制接口实现

- 行为型，描述类或对象怎样交互以及怎么分配职责

  - 定义：在不同的对象之间，划分责任和算法的抽象

**创建型：**

1.[单例模式（Singleton）](src/main/java/com/leo/creational/singleton)

某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
单例模式实现方式比较多，主要分在实现上是否支持懒汉模式，是否支持在线程安全中运用各项技巧。

2.[原型模式（Prototype）](src/main/java/com/leo/creational/prototype)

将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
主要解决创建重复对象。
在不指定类名的前提下生成实例。
①对象种类繁多，无法将他们整合到一个类中
②难以根据类生成实例
③解耦框架与生成的实例

3.[工厂方法模式（Factory Method）](src/main/java/com/leo/creational/factory)

定义一个用于创建产品的接口，由子类决定生产什么产品。
避免创建者和具体的实现逻辑耦合；
满足单一职责，每个业务逻辑实现都在自己所属的类中玩成，
满足开闭原则，无需更改使用调用方就可以引入新的类型。

4.[抽象工厂模式（AbstractFactory）](src/main/java/com/leo/creational/abstractFactory)

提供一个创建"产品簇"的接口，其每个子类可以生产一系列相关的产品。
不会对外暴露创建细节，并且会通过一个统一的接口创建所需对象

ps:与工厂模式的区别在于'单一'和'产品簇'

5.[建造者模式（Builder）](src/main/java/com/leo/creational/builder)

将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
多个简单对象构建出一个复杂对象。

基本属性/信息不变，组合经常改变的场景。

**结构型：**

6.[适配器模式（Adapter）](src/main/java/com/leo/structural/adapter)

将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

除适配接口，还可适配一些属性信息。

两种不同的模式：
+ 类适配器模式(使用 <u>**继承**</u> 的适配器)
+ 对象适配器模式(使用 <u>**委托**</u> 的适配器)

主要针对：多种差异化类型的接口实现统一输出

7.[装饰器模式（Decorator）](src/main/java/com/leo/structural/decorator)

动态的给对象增加一些职责，即增加其额外的功能。

装饰器主要解决的是直接继承时因功能的不断横向扩展导致子类膨胀的问题，而使用装饰器模式比直接集成更加灵活，同时也不需要维护子类。

+ 抽象构建角色（Component）：定义抽象接口；
+ 具体构建角色（ConcreteComponent）：实现抽象接口，可以是一组；
+ ☆ 装饰角色（Decorator）：定义抽象类并继承接口中的方法，保证一致性；
+ ☆ 具体装饰角色（ConcreteDecorator）：扩展装饰具体的实现逻辑。

8.[代理模式（Proxy）](src/main/java/com/leo/structural/proxy)

主体定义代理角色和 实际的主体角色间一致性的接口。

只在必要时生成实例

为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。

保护目标对象 或者 增强对象

spring中的体现主要是将类的代理注册到spring中，把bean交给spring管理。

9.[外观模式（Facade）](src/main/java/com/leo/structural/facade)

为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。

![示例UML](E:\leoWorkSpace\design_pattern\src\main\java\com\leo\structural\facade\facade1.png)
![facade模式类图](E:\leoWorkSpace\design_pattern\src\main\java\com\leo\structural\facade\facade2.png)

10.桥接模式（Bridge）

将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

11.组合模式（Composite）

将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。

12.享元模式（Flyweight）

+ 表示“轻量级”，通过尽量共享实例来避免new出实例。

+ 运用共享技术来有效地支持大量细粒度对象的复用。

+ 共享通用对象，减少内存的使用，提升系统的访问效率，较大的对象通常比较耗费内存，需要查询大量的接口或使用数据库资源，故有必要抽离出来作为共享对象使用。

设计思想：减少内存的使用，与原型模式通过复制对象的方式生成复杂对象、减少RPC调用的思想是类似的。

**行为型：**

13.策略模式（Strategy）

定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。

14.模板方法模式（TemplateMethod）

定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。

15.观察者模式（Observer）

多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。

16.迭代子模式（Iterator）

提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

17.责任链模式（Chain of Responsibility）

把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。

18.命令模式（Command）

将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。

19.备忘录模式（Memento）

在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。

20.状态模式（State）

允许一个对象在其内部状态发生改变时改变其行为能力。

21.访问者模式（Visitor）

在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。

22.中介者模式（Mediator）

定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。

23.解释器模式（Interpreter）

提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。
