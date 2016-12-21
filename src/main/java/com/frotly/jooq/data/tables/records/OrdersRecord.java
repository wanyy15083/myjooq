/**
 * This class is generated by jOOQ
 */
package com.frotly.jooq.data.tables.records;


import com.frotly.jooq.data.tables.Orders;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OrdersRecord extends UpdatableRecordImpl<OrdersRecord> implements Record5<Integer, Integer, String, Timestamp, String> {

	private static final long serialVersionUID = -1998490393;

	/**
	 * Setter for <code>learn.orders.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>learn.orders.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>learn.orders.user_id</code>. 下单用户id
	 */
	public void setUserId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>learn.orders.user_id</code>. 下单用户id
	 */
	public Integer getUserId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>learn.orders.number</code>. 订单号
	 */
	public void setNumber(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>learn.orders.number</code>. 订单号
	 */
	public String getNumber() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>learn.orders.createtime</code>. 创建订单时间
	 */
	public void setCreatetime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>learn.orders.createtime</code>. 创建订单时间
	 */
	public Timestamp getCreatetime() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>learn.orders.note</code>. 备注
	 */
	public void setNote(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>learn.orders.note</code>. 备注
	 */
	public String getNote() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Timestamp, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Timestamp, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Orders.ORDERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Orders.ORDERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Orders.ORDERS.NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return Orders.ORDERS.CREATETIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Orders.ORDERS.NOTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getCreatetime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getNote();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord value2(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord value3(String value) {
		setNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord value4(Timestamp value) {
		setCreatetime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord value5(String value) {
		setNote(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrdersRecord values(Integer value1, Integer value2, String value3, Timestamp value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OrdersRecord
	 */
	public OrdersRecord() {
		super(Orders.ORDERS);
	}

	/**
	 * Create a detached, initialised OrdersRecord
	 */
	public OrdersRecord(Integer id, Integer userId, String number, Timestamp createtime, String note) {
		super(Orders.ORDERS);

		setValue(0, id);
		setValue(1, userId);
		setValue(2, number);
		setValue(3, createtime);
		setValue(4, note);
	}
}