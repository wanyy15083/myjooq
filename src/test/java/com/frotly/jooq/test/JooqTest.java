package com.frotly.jooq.test;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.jooq.Configuration;
import org.jooq.ConnectionProvider;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.TransactionProvider;
import org.jooq.impl.DSL;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultTransactionProvider;
import org.junit.Before;

/**
 * Created by songyigui on 2016/12/19.
 */
public class JooqTest {
    private DSLContext dslContext;

    @Before
    public void before() {
        this.dslContext = getDslContext();
    }

//    @Test
//    public void insert() {
//        MyUser user = new MyUser();
//        user.setUsername("小红");
//        user.setSex("1");
//        UserRecord userRecord = dslContext.newRecord(Tables.USER, user);
//        userRecord.insert();
//
//        dslContext.insertInto(Tables.USER)
//                .set(User.USER.USERNAME, "小张")
//                .set(User.USER.SEX, "2")
//                .execute();
//    }
//
//    @Test
//    public void find() {
//        dslContext.selectFrom(Tables.USER)
//                .where(User.USER.USERNAME.eq("王五"))
//                .fetchInto(MyUser.class);
////                .stream()
////                .forEach(myUser -> System.out.println(myUser.getUsername()));
//    }
//
//    @Test
//    public void update() {
//        dslContext.update(Tables.USER)
//                .set(User.USER.USERNAME, "小勇")
//                .where(User.USER.ID.eq(24))
//                .execute();
//    }
//
//    //    select * from orders a
////    left join
////            (select b.orders_id,count(*) detail_num from orderdetail b
////    where b.orders_id =4
////    group by b.orders_id
////    ) c
////    on a.id=c.orders_id
////    where a.id =3
//    @Test
//    public void join() {
//        List<Integer> ids = new ArrayList<Integer>();
//        ids.add(3);
//        ids.add(4);
//        List<MyOrder> list = dslContext.select()
//                .from(Tables.ORDERS)
//                .leftJoin(DSL.table(DSL.select(Orderdetail.ORDERDETAIL.ORDERS_ID, DSL.count().as("detail_num"))
//                        .from(Tables.ORDERDETAIL)
//                        .where(Orderdetail.ORDERDETAIL.ORDERS_ID.in(ids))
//                        .groupBy(Orderdetail.ORDERDETAIL.ORDERS_ID))
//                        .as("o1"))
//                .on(Orders.ORDERS.ID.eq(DSL.field(DSL.name("o1", Orderdetail.ORDERDETAIL.ORDERS_ID.getName()), Integer.class)))
//                .where(Orders.ORDERS.ID.in(ids))
//                .fetch()
//                .map(record -> {
//                    MyOrder order = record.into(MyOrder.class);
//                    return order;
//                });
//        System.out.println(list);
//    }
//
//    @Test
//    public void transaction(){
//        dslContext.transaction(configuration -> {
//            DSL.using(configuration).update(Tables.USER)
//                    .set(User.USER.USERNAME,"transaction test1")
//                    .where(User.USER.ID.eq(24))
//                    .execute();
//            DSL.using(configuration).update(Tables.USER)
//                    .set(User.USER.USERNAME,"transaction test2")
//                    .where(User.USER.ID.eq(1))
//                    .execute();
//            int i = 1/0;
//        });
//    }
//
//    @After
//    public void after() {
//        dslContext.delete(Tables.USER);
//    }

    //    private DSLContext getDslContext() {
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "1234");
//            return DSL.using(connection, SQLDialect.MYSQL);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    private DSLContext getDslContext() {
        PoolProperties p = new PoolProperties();
        p.setUrl("jdbc:mysql://localhost:3306/learn");
        p.setDriverClassName("com.mysql.jdbc.Driver");
        p.setUsername("root");
        p.setPassword("1234");
        p.setJmxEnabled(true);
        p.setTestWhileIdle(false);
        p.setTestOnBorrow(true);
        p.setValidationQuery("SELECT 1");
        p.setTestOnReturn(false);
        p.setValidationInterval(30000);
        p.setTimeBetweenEvictionRunsMillis(30000);
        p.setMaxActive(100);
        p.setInitialSize(10);
        p.setMaxWait(10000);
        p.setRemoveAbandonedTimeout(60);
        p.setMinEvictableIdleTimeMillis(30000);
        p.setMinIdle(10);
        p.setLogAbandoned(true);
        p.setRemoveAbandoned(true);
        p.setJdbcInterceptors(
                "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;" +
                        "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
        DataSource datasource = new DataSource();
        datasource.setPoolProperties(p);
        ConnectionProvider connectionProvider = new DataSourceConnectionProvider(datasource);
//        TransactionProvider transactionProvider = new DefaultTransactionProvider(connectionProvider,false);
        TransactionProvider transactionProvider = new DefaultTransactionProvider(connectionProvider);
        Configuration configuration = new DefaultConfiguration()
                .set(connectionProvider)
                .set(transactionProvider)
                .set(SQLDialect.MYSQL);
        return DSL.using(configuration);
    }


    public static class MyUser {
        private String username;
        private String sex;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class MyOrder {
        private Integer userId;
        private Integer ordersId;
        private Integer detailNum;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getOrdersId() {
            return ordersId;
        }

        public void setOrdersId(Integer ordersId) {
            this.ordersId = ordersId;
        }

        public Integer getDetailNum() {
            return detailNum;
        }

        public void setDetailNum(Integer detailNum) {
            this.detailNum = detailNum;
        }
    }

}
