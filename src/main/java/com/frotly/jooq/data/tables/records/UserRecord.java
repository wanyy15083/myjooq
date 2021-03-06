/**
 * This class is generated by jOOQ
 */
package com.frotly.jooq.data.tables.records;


import com.frotly.jooq.data.tables.User;

import java.sql.Date;

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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record5<Integer, String, Date, String, String> {

	private static final long serialVersionUID = -659396808;

	/**
	 * Setter for <code>learn.user.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>learn.user.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>learn.user.username</code>. 用户名称
	 */
	public void setUsername(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>learn.user.username</code>. 用户名称
	 */
	public String getUsername() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>learn.user.birthday</code>. 生日
	 */
	public void setBirthday(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>learn.user.birthday</code>. 生日
	 */
	public Date getBirthday() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>learn.user.sex</code>. 性别
	 */
	public void setSex(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>learn.user.sex</code>. 性别
	 */
	public String getSex() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>learn.user.address</code>. 地址
	 */
	public void setAddress(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>learn.user.address</code>. 地址
	 */
	public String getAddress() {
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
	public Row5<Integer, String, Date, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, Date, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return User.USER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return User.USER.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return User.USER.BIRTHDAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return User.USER.SEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return User.USER.ADDRESS;
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
	public String value2() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getBirthday();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getSex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(Date value) {
		setBirthday(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(String value) {
		setSex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value5(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(Integer value1, String value2, Date value3, String value4, String value5) {
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
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(Integer id, String username, Date birthday, String sex, String address) {
		super(User.USER);

		setValue(0, id);
		setValue(1, username);
		setValue(2, birthday);
		setValue(3, sex);
		setValue(4, address);
	}
}
