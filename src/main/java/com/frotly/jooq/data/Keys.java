/**
 * This class is generated by jOOQ
 */
package com.frotly.jooq.data;


import com.frotly.jooq.data.tables.Items;
import com.frotly.jooq.data.tables.Orderdetail;
import com.frotly.jooq.data.tables.Orders;
import com.frotly.jooq.data.tables.User;
import com.frotly.jooq.data.tables.records.ItemsRecord;
import com.frotly.jooq.data.tables.records.OrderdetailRecord;
import com.frotly.jooq.data.tables.records.OrdersRecord;
import com.frotly.jooq.data.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>learn</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<ItemsRecord, Integer> IDENTITY_ITEMS = Identities0.IDENTITY_ITEMS;
	public static final Identity<OrderdetailRecord, Integer> IDENTITY_ORDERDETAIL = Identities0.IDENTITY_ORDERDETAIL;
	public static final Identity<OrdersRecord, Integer> IDENTITY_ORDERS = Identities0.IDENTITY_ORDERS;
	public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ItemsRecord> KEY_ITEMS_PRIMARY = UniqueKeys0.KEY_ITEMS_PRIMARY;
	public static final UniqueKey<OrderdetailRecord> KEY_ORDERDETAIL_PRIMARY = UniqueKeys0.KEY_ORDERDETAIL_PRIMARY;
	public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = UniqueKeys0.KEY_ORDERS_PRIMARY;
	public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<OrderdetailRecord, OrdersRecord> FK_ORDERDETAIL_1 = ForeignKeys0.FK_ORDERDETAIL_1;
	public static final ForeignKey<OrderdetailRecord, ItemsRecord> FK_ORDERDETAIL_2 = ForeignKeys0.FK_ORDERDETAIL_2;
	public static final ForeignKey<OrdersRecord, UserRecord> FK_ORDERS_1 = ForeignKeys0.FK_ORDERS_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<ItemsRecord, Integer> IDENTITY_ITEMS = createIdentity(Items.ITEMS, Items.ITEMS.ID);
		public static Identity<OrderdetailRecord, Integer> IDENTITY_ORDERDETAIL = createIdentity(Orderdetail.ORDERDETAIL, Orderdetail.ORDERDETAIL.ID);
		public static Identity<OrdersRecord, Integer> IDENTITY_ORDERS = createIdentity(Orders.ORDERS, Orders.ORDERS.ID);
		public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ItemsRecord> KEY_ITEMS_PRIMARY = createUniqueKey(Items.ITEMS, Items.ITEMS.ID);
		public static final UniqueKey<OrderdetailRecord> KEY_ORDERDETAIL_PRIMARY = createUniqueKey(Orderdetail.ORDERDETAIL, Orderdetail.ORDERDETAIL.ID);
		public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = createUniqueKey(Orders.ORDERS, Orders.ORDERS.ID);
		public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, User.USER.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<OrderdetailRecord, OrdersRecord> FK_ORDERDETAIL_1 = createForeignKey(com.frotly.jooq.data.Keys.KEY_ORDERS_PRIMARY, Orderdetail.ORDERDETAIL, Orderdetail.ORDERDETAIL.ORDERS_ID);
		public static final ForeignKey<OrderdetailRecord, ItemsRecord> FK_ORDERDETAIL_2 = createForeignKey(com.frotly.jooq.data.Keys.KEY_ITEMS_PRIMARY, Orderdetail.ORDERDETAIL, Orderdetail.ORDERDETAIL.ITEMS_ID);
		public static final ForeignKey<OrdersRecord, UserRecord> FK_ORDERS_1 = createForeignKey(com.frotly.jooq.data.Keys.KEY_USER_PRIMARY, Orders.ORDERS, Orders.ORDERS.USER_ID);
	}
}
