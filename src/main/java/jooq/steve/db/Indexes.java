/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db;


import javax.annotation.processing.Generated;

import jooq.steve.db.tables.ChargeBox;
import jooq.steve.db.tables.ConnectorMeterValue;
import jooq.steve.db.tables.ConnectorStatus;
import jooq.steve.db.tables.OcppTag;
import jooq.steve.db.tables.Reservation;
import jooq.steve.db.tables.SchemaVersion;
import jooq.steve.db.tables.TransactionStart;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in stevedb.
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
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CHARGE_BOX_CHARGEBOX_OP_EP_IDX = Internal.createIndex(DSL.name("chargebox_op_ep_idx"), ChargeBox.CHARGE_BOX, new OrderField[] { ChargeBox.CHARGE_BOX.OCPP_PROTOCOL, ChargeBox.CHARGE_BOX.ENDPOINT_ADDRESS }, false);
    public static final Index CONNECTOR_METER_VALUE_CMV_VALUE_TIMESTAMP_IDX = Internal.createIndex(DSL.name("cmv_value_timestamp_idx"), ConnectorMeterValue.CONNECTOR_METER_VALUE, new OrderField[] { ConnectorMeterValue.CONNECTOR_METER_VALUE.VALUE_TIMESTAMP }, false);
    public static final Index TRANSACTION_START_CONNECTOR_PK_IDX = Internal.createIndex(DSL.name("connector_pk_idx"), TransactionStart.TRANSACTION_START, new OrderField[] { TransactionStart.TRANSACTION_START.CONNECTOR_PK }, false);
    public static final Index CONNECTOR_STATUS_CONNECTOR_STATUS_CPK_ST_IDX = Internal.createIndex(DSL.name("connector_status_cpk_st_idx"), ConnectorStatus.CONNECTOR_STATUS, new OrderField[] { ConnectorStatus.CONNECTOR_STATUS.CONNECTOR_PK, ConnectorStatus.CONNECTOR_STATUS.STATUS_TIMESTAMP }, false);
    public static final Index CONNECTOR_METER_VALUE_FK_CM_PK_IDX = Internal.createIndex(DSL.name("FK_cm_pk_idx"), ConnectorMeterValue.CONNECTOR_METER_VALUE, new OrderField[] { ConnectorMeterValue.CONNECTOR_METER_VALUE.CONNECTOR_PK }, false);
    public static final Index RESERVATION_FK_CONNECTOR_PK_RESERV_IDX = Internal.createIndex(DSL.name("FK_connector_pk_reserv_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.CONNECTOR_PK }, false);
    public static final Index CONNECTOR_STATUS_FK_CS_PK_IDX = Internal.createIndex(DSL.name("FK_cs_pk_idx"), ConnectorStatus.CONNECTOR_STATUS, new OrderField[] { ConnectorStatus.CONNECTOR_STATUS.CONNECTOR_PK }, false);
    public static final Index RESERVATION_FK_IDTAG_R_IDX = Internal.createIndex(DSL.name("FK_idTag_r_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.ID_TAG }, false);
    public static final Index CONNECTOR_METER_VALUE_FK_TID_CM_IDX = Internal.createIndex(DSL.name("FK_tid_cm_idx"), ConnectorMeterValue.CONNECTOR_METER_VALUE, new OrderField[] { ConnectorMeterValue.CONNECTOR_METER_VALUE.TRANSACTION_PK }, false);
    public static final Index TRANSACTION_START_IDTAG_IDX = Internal.createIndex(DSL.name("idTag_idx"), TransactionStart.TRANSACTION_START, new OrderField[] { TransactionStart.TRANSACTION_START.ID_TAG }, false);
    public static final Index RESERVATION_RESERVATION_EXPIRY_IDX = Internal.createIndex(DSL.name("reservation_expiry_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.EXPIRY_DATETIME }, false);
    public static final Index RESERVATION_RESERVATION_START_IDX = Internal.createIndex(DSL.name("reservation_start_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.START_DATETIME }, false);
    public static final Index RESERVATION_RESERVATION_STATUS_IDX = Internal.createIndex(DSL.name("reservation_status_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.STATUS }, false);
    public static final Index SCHEMA_VERSION_SCHEMA_VERSION_S_IDX = Internal.createIndex(DSL.name("schema_version_s_idx"), SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.SUCCESS }, false);
    public static final Index TRANSACTION_START_TRANSACTION_START_IDX = Internal.createIndex(DSL.name("transaction_start_idx"), TransactionStart.TRANSACTION_START, new OrderField[] { TransactionStart.TRANSACTION_START.START_TIMESTAMP }, false);
    public static final Index OCPP_TAG_USER_EXPIRYDATE_IDX = Internal.createIndex(DSL.name("user_expiryDate_idx"), OcppTag.OCPP_TAG, new OrderField[] { OcppTag.OCPP_TAG.EXPIRY_DATE }, false);
}
