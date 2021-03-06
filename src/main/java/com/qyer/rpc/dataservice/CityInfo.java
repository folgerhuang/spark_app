/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.qyer.rpc.dataservice;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-26")
public class CityInfo implements org.apache.thrift.TBase<CityInfo, CityInfo._Fields>, java.io.Serializable, Cloneable, Comparable<CityInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CityInfo");

  private static final org.apache.thrift.protocol.TField CITY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("cityCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNTRY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("countryCode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LATITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("latitude", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField LONGITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("longitude", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CityInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CityInfoTupleSchemeFactory());
  }

  public int cityCode; // required
  public String city; // required
  public int countryCode; // required
  public String country; // required
  public double latitude; // required
  public double longitude; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CITY_CODE((short)1, "cityCode"),
    CITY((short)2, "city"),
    COUNTRY_CODE((short)3, "countryCode"),
    COUNTRY((short)4, "country"),
    LATITUDE((short)5, "latitude"),
    LONGITUDE((short)6, "longitude");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CITY_CODE
          return CITY_CODE;
        case 2: // CITY
          return CITY;
        case 3: // COUNTRY_CODE
          return COUNTRY_CODE;
        case 4: // COUNTRY
          return COUNTRY;
        case 5: // LATITUDE
          return LATITUDE;
        case 6: // LONGITUDE
          return LONGITUDE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CITYCODE_ISSET_ID = 0;
  private static final int __COUNTRYCODE_ISSET_ID = 1;
  private static final int __LATITUDE_ISSET_ID = 2;
  private static final int __LONGITUDE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CITY_CODE, new org.apache.thrift.meta_data.FieldMetaData("cityCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY_CODE, new org.apache.thrift.meta_data.FieldMetaData("countryCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LATITUDE, new org.apache.thrift.meta_data.FieldMetaData("latitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LONGITUDE, new org.apache.thrift.meta_data.FieldMetaData("longitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CityInfo.class, metaDataMap);
  }

  public CityInfo() {
  }

  public CityInfo(
    int cityCode,
    String city,
    int countryCode,
    String country,
    double latitude,
    double longitude)
  {
    this();
    this.cityCode = cityCode;
    setCityCodeIsSet(true);
    this.city = city;
    this.countryCode = countryCode;
    setCountryCodeIsSet(true);
    this.country = country;
    this.latitude = latitude;
    setLatitudeIsSet(true);
    this.longitude = longitude;
    setLongitudeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CityInfo(CityInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cityCode = other.cityCode;
    if (other.isSetCity()) {
      this.city = other.city;
    }
    this.countryCode = other.countryCode;
    if (other.isSetCountry()) {
      this.country = other.country;
    }
    this.latitude = other.latitude;
    this.longitude = other.longitude;
  }

  public CityInfo deepCopy() {
    return new CityInfo(this);
  }

  @Override
  public void clear() {
    setCityCodeIsSet(false);
    this.cityCode = 0;
    this.city = null;
    setCountryCodeIsSet(false);
    this.countryCode = 0;
    this.country = null;
    setLatitudeIsSet(false);
    this.latitude = 0.0;
    setLongitudeIsSet(false);
    this.longitude = 0.0;
  }

  public int getCityCode() {
    return this.cityCode;
  }

  public CityInfo setCityCode(int cityCode) {
    this.cityCode = cityCode;
    setCityCodeIsSet(true);
    return this;
  }

  public void unsetCityCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CITYCODE_ISSET_ID);
  }

  /** Returns true if field cityCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCityCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CITYCODE_ISSET_ID);
  }

  public void setCityCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CITYCODE_ISSET_ID, value);
  }

  public String getCity() {
    return this.city;
  }

  public CityInfo setCity(String city) {
    this.city = city;
    return this;
  }

  public void unsetCity() {
    this.city = null;
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return this.city != null;
  }

  public void setCityIsSet(boolean value) {
    if (!value) {
      this.city = null;
    }
  }

  public int getCountryCode() {
    return this.countryCode;
  }

  public CityInfo setCountryCode(int countryCode) {
    this.countryCode = countryCode;
    setCountryCodeIsSet(true);
    return this;
  }

  public void unsetCountryCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNTRYCODE_ISSET_ID);
  }

  /** Returns true if field countryCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCountryCode() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNTRYCODE_ISSET_ID);
  }

  public void setCountryCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNTRYCODE_ISSET_ID, value);
  }

  public String getCountry() {
    return this.country;
  }

  public CityInfo setCountry(String country) {
    this.country = country;
    return this;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public double getLatitude() {
    return this.latitude;
  }

  public CityInfo setLatitude(double latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
    return this;
  }

  public void unsetLatitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATITUDE_ISSET_ID, value);
  }

  public double getLongitude() {
    return this.longitude;
  }

  public CityInfo setLongitude(double longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
    return this;
  }

  public void unsetLongitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LONGITUDE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CITY_CODE:
      if (value == null) {
        unsetCityCode();
      } else {
        setCityCode((Integer)value);
      }
      break;

    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((String)value);
      }
      break;

    case COUNTRY_CODE:
      if (value == null) {
        unsetCountryCode();
      } else {
        setCountryCode((Integer)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((String)value);
      }
      break;

    case LATITUDE:
      if (value == null) {
        unsetLatitude();
      } else {
        setLatitude((Double)value);
      }
      break;

    case LONGITUDE:
      if (value == null) {
        unsetLongitude();
      } else {
        setLongitude((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CITY_CODE:
      return Integer.valueOf(getCityCode());

    case CITY:
      return getCity();

    case COUNTRY_CODE:
      return Integer.valueOf(getCountryCode());

    case COUNTRY:
      return getCountry();

    case LATITUDE:
      return Double.valueOf(getLatitude());

    case LONGITUDE:
      return Double.valueOf(getLongitude());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CITY_CODE:
      return isSetCityCode();
    case CITY:
      return isSetCity();
    case COUNTRY_CODE:
      return isSetCountryCode();
    case COUNTRY:
      return isSetCountry();
    case LATITUDE:
      return isSetLatitude();
    case LONGITUDE:
      return isSetLongitude();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CityInfo)
      return this.equals((CityInfo)that);
    return false;
  }

  public boolean equals(CityInfo that) {
    if (that == null)
      return false;

    boolean this_present_cityCode = true;
    boolean that_present_cityCode = true;
    if (this_present_cityCode || that_present_cityCode) {
      if (!(this_present_cityCode && that_present_cityCode))
        return false;
      if (this.cityCode != that.cityCode)
        return false;
    }

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (!this.city.equals(that.city))
        return false;
    }

    boolean this_present_countryCode = true;
    boolean that_present_countryCode = true;
    if (this_present_countryCode || that_present_countryCode) {
      if (!(this_present_countryCode && that_present_countryCode))
        return false;
      if (this.countryCode != that.countryCode)
        return false;
    }

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cityCode = true;
    list.add(present_cityCode);
    if (present_cityCode)
      list.add(cityCode);

    boolean present_city = true && (isSetCity());
    list.add(present_city);
    if (present_city)
      list.add(city);

    boolean present_countryCode = true;
    list.add(present_countryCode);
    if (present_countryCode)
      list.add(countryCode);

    boolean present_country = true && (isSetCountry());
    list.add(present_country);
    if (present_country)
      list.add(country);

    boolean present_latitude = true;
    list.add(present_latitude);
    if (present_latitude)
      list.add(latitude);

    boolean present_longitude = true;
    list.add(present_longitude);
    if (present_longitude)
      list.add(longitude);

    return list.hashCode();
  }

  @Override
  public int compareTo(CityInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCityCode()).compareTo(other.isSetCityCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCityCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cityCode, other.cityCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCity()).compareTo(other.isSetCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.city, other.city);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCountryCode()).compareTo(other.isSetCountryCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountryCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.countryCode, other.countryCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCountry()).compareTo(other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatitude()).compareTo(other.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latitude, other.latitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLongitude()).compareTo(other.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longitude, other.longitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CityInfo(");
    boolean first = true;

    sb.append("cityCode:");
    sb.append(this.cityCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("city:");
    if (this.city == null) {
      sb.append("null");
    } else {
      sb.append(this.city);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("countryCode:");
    sb.append(this.countryCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("country:");
    if (this.country == null) {
      sb.append("null");
    } else {
      sb.append(this.country);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CityInfoStandardSchemeFactory implements SchemeFactory {
    public CityInfoStandardScheme getScheme() {
      return new CityInfoStandardScheme();
    }
  }

  private static class CityInfoStandardScheme extends StandardScheme<CityInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CityInfo struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CITY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cityCode = iprot.readI32();
              struct.setCityCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.city = iprot.readString();
              struct.setCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNTRY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.countryCode = iprot.readI32();
              struct.setCountryCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LATITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.latitude = iprot.readDouble();
              struct.setLatitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LONGITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.longitude = iprot.readDouble();
              struct.setLongitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CityInfo struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CITY_CODE_FIELD_DESC);
      oprot.writeI32(struct.cityCode);
      oprot.writeFieldEnd();
      if (struct.city != null) {
        oprot.writeFieldBegin(CITY_FIELD_DESC);
        oprot.writeString(struct.city);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNTRY_CODE_FIELD_DESC);
      oprot.writeI32(struct.countryCode);
      oprot.writeFieldEnd();
      if (struct.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(struct.country);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(struct.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(struct.longitude);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CityInfoTupleSchemeFactory implements SchemeFactory {
    public CityInfoTupleScheme getScheme() {
      return new CityInfoTupleScheme();
    }
  }

  private static class CityInfoTupleScheme extends TupleScheme<CityInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CityInfo struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCityCode()) {
        optionals.set(0);
      }
      if (struct.isSetCity()) {
        optionals.set(1);
      }
      if (struct.isSetCountryCode()) {
        optionals.set(2);
      }
      if (struct.isSetCountry()) {
        optionals.set(3);
      }
      if (struct.isSetLatitude()) {
        optionals.set(4);
      }
      if (struct.isSetLongitude()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCityCode()) {
        oprot.writeI32(struct.cityCode);
      }
      if (struct.isSetCity()) {
        oprot.writeString(struct.city);
      }
      if (struct.isSetCountryCode()) {
        oprot.writeI32(struct.countryCode);
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
      if (struct.isSetLatitude()) {
        oprot.writeDouble(struct.latitude);
      }
      if (struct.isSetLongitude()) {
        oprot.writeDouble(struct.longitude);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CityInfo struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.cityCode = iprot.readI32();
        struct.setCityCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.city = iprot.readString();
        struct.setCityIsSet(true);
      }
      if (incoming.get(2)) {
        struct.countryCode = iprot.readI32();
        struct.setCountryCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
      if (incoming.get(4)) {
        struct.latitude = iprot.readDouble();
        struct.setLatitudeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.longitude = iprot.readDouble();
        struct.setLongitudeIsSet(true);
      }
    }
  }

}

