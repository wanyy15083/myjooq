/**
 * This class is generated by jOOQ
 */
package com.frotly.jooq.data.tables;


import com.frotly.jooq.data.Keys;
import com.frotly.jooq.data.Learn;
import com.frotly.jooq.data.tables.records.ItemsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Items extends TableImpl<ItemsRecord> {

	private static final long serialVersionUID = 1381021467;

	/**
	 * The reference instance of <code>learn.items</code>
	 */
	public static final Items ITEMS = new Items();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ItemsRecord> getRecordType() {
		return ItemsRecord.class;
	}

	/**
	 * The column <code>learn.items.id</code>.
	 */
	public final TableField<ItemsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>learn.items.name</code>. 商品名称
	 */
	public final TableField<ItemsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "商品名称");

	/**
	 * The column <code>learn.items.price</code>. 商品定价
	 */
	public final TableField<ItemsRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "商品定价");

	/**
	 * The column <code>learn.items.detail</code>. 商品描述
	 */
	public final TableField<ItemsRecord, String> DETAIL = createField("detail", org.jooq.impl.SQLDataType.CLOB, this, "商品描述");

	/**
	 * The column <code>learn.items.pic</code>. 商品图片
	 */
	public final TableField<ItemsRecord, String> PIC = createField("pic", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "商品图片");

	/**
	 * The column <code>learn.items.createtime</code>. 生产日期
	 */
	public final TableField<ItemsRecord, Timestamp> CREATETIME = createField("createtime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "生产日期");

	/**
	 * Create a <code>learn.items</code> table reference
	 */
	public Items() {
		this("items", null);
	}

	/**
	 * Create an aliased <code>learn.items</code> table reference
	 */
	public Items(String alias) {
		this(alias, ITEMS);
	}

	private Items(String alias, Table<ItemsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Items(String alias, Table<ItemsRecord> aliased, Field<?>[] parameters) {
		super(alias, Learn.LEARN, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ItemsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ITEMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ItemsRecord> getPrimaryKey() {
		return Keys.KEY_ITEMS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ItemsRecord>> getKeys() {
		return Arrays.<UniqueKey<ItemsRecord>>asList(Keys.KEY_ITEMS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Items as(String alias) {
		return new Items(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Items rename(String name) {
		return new Items(name, null);
	}
}
