1、aop - 事务

	> setAutoCommit = false	
	> success = commit
	> error = rollback

2、TransactionProxyFactoryBean - 事务中的（ProxyFactoryBean - AOP中的）

    - AbstractSingletonProxyFactoryBean    
       - FactoryBean
       - InitializingBean
    - 在 InitializingBean 的 回调方法中完成了代理对象的创建，即在初始化 TransactionProxyFactoryBean 的时候
    
3、事务管理器 

    - PlatformTransactionManager
        - AbstractPlatformTransactionManager 
            - DataSourceTransactionManager - jdbc
            - HibernateTransactionManager -hibernate
            - JtaTransactionManager - jta
        - SpringManagedTransaction - mybatis-spring
        - JdbcTransaction - mybatis
        
    - doBegin() => setAutoCommit(false) 只要配置了事务管理器，没有显示设置 false ，在Spring底层也会进行设置
    - commit() => processCommit() => doCommit()
    - rollback() => processRollback => doRollback()
    
4、ReflectiveMethodInvocation => AOP中的重要组件
   
   - Map<MethodCacheKey, List<Object>> methodCache => 方法及通知的缓存：key-要执行的方法，value-Advisor集合 