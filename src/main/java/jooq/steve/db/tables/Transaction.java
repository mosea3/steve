/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import javax.annotation.processing.Generated;

import jooq.steve.db.Stevedb;
import jooq.steve.db.enums.TransactionStopEventActor;
import jooq.steve.db.tables.records.TransactionRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.1",
        "schema version:1.0.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transaction extends TableImpl<TransactionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.transaction</code>
     */
    public static final Transaction TRANSACTION = new Transaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionRecord> getRecordType() {
        return TransactionRecord.class;
    }

    /**
     * The column <code>stevedb.transaction.transaction_pk</code>.
     */
    public final TableField<TransactionRecord, Integer> TRANSACTION_PK = createField(DSL.name("transaction_pk"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>stevedb.transaction.connector_pk</code>.
     */
    public final TableField<TransactionRecord, Integer> CONNECTOR_PK = createField(DSL.name("connector_pk"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stevedb.transaction.id_tag</code>.
     */
    public final TableField<TransactionRecord, String> ID_TAG = createField(DSL.name("id_tag"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.transaction.start_event_timestamp</code>.
     */
    public final TableField<TransactionRecord, DateTime> START_EVENT_TIMESTAMP = createField(DSL.name("start_event_timestamp"), SQLDataType.TIMESTAMP(6).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00.000000", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction.start_timestamp</code>.
     */
    public final TableField<TransactionRecord, DateTime> START_TIMESTAMP = createField(DSL.name("start_timestamp"), SQLDataType.TIMESTAMP(6), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction.start_value</code>.
     */
    public final TableField<TransactionRecord, String> START_VALUE = createField(DSL.name("start_value"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.transaction.stop_event_actor</code>.
     */
    public final TableField<TransactionRecord, TransactionStopEventActor> STOP_EVENT_ACTOR = createField(DSL.name("stop_event_actor"), SQLDataType.VARCHAR(7).asEnumDataType(jooq.steve.db.enums.TransactionStopEventActor.class), this, "");

    /**
     * The column <code>stevedb.transaction.stop_event_timestamp</code>.
     */
    public final TableField<TransactionRecord, DateTime> STOP_EVENT_TIMESTAMP = createField(DSL.name("stop_event_timestamp"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.inline("0000-00-00 00:00:00.000000", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction.stop_timestamp</code>.
     */
    public final TableField<TransactionRecord, DateTime> STOP_TIMESTAMP = createField(DSL.name("stop_timestamp"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.inline("0000-00-00 00:00:00.000000", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction.stop_value</code>.
     */
    public final TableField<TransactionRecord, String> STOP_VALUE = createField(DSL.name("stop_value"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.transaction.stop_reason</code>.
     */
    public final TableField<TransactionRecord, String> STOP_REASON = createField(DSL.name("stop_reason"), SQLDataType.VARCHAR(255), this, "");

    private Transaction(Name alias, Table<TransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transaction(Name alias, Table<TransactionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `transaction` as select `tx1`.`transaction_pk` AS `transaction_pk`,`tx1`.`connector_pk` AS `connector_pk`,`tx1`.`id_tag` AS `id_tag`,`tx1`.`event_timestamp` AS `start_event_timestamp`,`tx1`.`start_timestamp` AS `start_timestamp`,`tx1`.`start_value` AS `start_value`,`tx2`.`event_actor` AS `stop_event_actor`,`tx2`.`event_timestamp` AS `stop_event_timestamp`,`tx2`.`stop_timestamp` AS `stop_timestamp`,`tx2`.`stop_value` AS `stop_value`,`tx2`.`stop_reason` AS `stop_reason` from (`stevedb`.`transaction_start` `tx1` left join (select `s1`.`transaction_pk` AS `transaction_pk`,`s1`.`event_timestamp` AS `event_timestamp`,`s1`.`event_actor` AS `event_actor`,`s1`.`stop_timestamp` AS `stop_timestamp`,`s1`.`stop_value` AS `stop_value`,`s1`.`stop_reason` AS `stop_reason` from `stevedb`.`transaction_stop` `s1` where (`s1`.`event_timestamp` = (select max(`s2`.`event_timestamp`) from `stevedb`.`transaction_stop` `s2` where (`s1`.`transaction_pk` = `s2`.`transaction_pk`))) group by `s1`.`transaction_pk`,`s1`.`event_timestamp`) `tx2` on((`tx1`.`transaction_pk` = `tx2`.`transaction_pk`)))"));
    }

    /**
     * Create an aliased <code>stevedb.transaction</code> table reference
     */
    public Transaction(String alias) {
        this(DSL.name(alias), TRANSACTION);
    }

    /**
     * Create an aliased <code>stevedb.transaction</code> table reference
     */
    public Transaction(Name alias) {
        this(alias, TRANSACTION);
    }

    /**
     * Create a <code>stevedb.transaction</code> table reference
     */
    public Transaction() {
        this(DSL.name("transaction"), null);
    }

    public <O extends Record> Transaction(Table<O> child, ForeignKey<O, TransactionRecord> key) {
        super(child, key, TRANSACTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public Transaction as(String alias) {
        return new Transaction(DSL.name(alias), this);
    }

    @Override
    public Transaction as(Name alias) {
        return new Transaction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(String name) {
        return new Transaction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(Name name) {
        return new Transaction(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, DateTime, DateTime, String, TransactionStopEventActor, DateTime, DateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
