/**
 * This class is generated by jOOQ
 */
package com.frotly.jooq.data;


import com.frotly.jooq.data.tables.Items;
import com.frotly.jooq.data.tables.Orderdetail;
import com.frotly.jooq.data.tables.Orders;
import com.frotly.jooq.data.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Learn extends SchemaImpl {

	private static final long serialVersionUID = -1349272541;

	/**
	 * The reference instance of <code>learn</code>
	 */
	public static final Learn LEARN = new Learn();

	/**
	 * No further instances allowed
	 */
	private Learn() {
		super("learn");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Items.ITEMS,
			Orderdetail.ORDERDETAIL,
			Orders.ORDERS,
			User.USER);
	}
}
