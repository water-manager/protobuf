// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code Value}
 */
public final class Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Value)
    ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Value() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Value();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Value(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {
            valueCase_ = 2;
            value_ = input.readBool();
            break;
          }
          case 24: {
            valueCase_ = 3;
            value_ = input.readInt32();
            break;
          }
          case 33: {
            valueCase_ = 4;
            value_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            valueCase_ = 5;
            value_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.igorxp5.proto.api.Api.internal_static_Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.Value.class, dev.igorxp5.proto.api.Value.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOOLVALUE(2),
    INTVALUE(3),
    DOUBLEVALUE(4),
    STRINGVLAUE(5),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return BOOLVALUE;
        case 3: return INTVALUE;
        case 4: return DOUBLEVALUE;
        case 5: return STRINGVLAUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int BOOLVALUE_FIELD_NUMBER = 2;
  /**
   * <code>bool boolValue = 2;</code>
   * @return Whether the boolValue field is set.
   */
  @java.lang.Override
  public boolean hasBoolValue() {
    return valueCase_ == 2;
  }
  /**
   * <code>bool boolValue = 2;</code>
   * @return The boolValue.
   */
  @java.lang.Override
  public boolean getBoolValue() {
    if (valueCase_ == 2) {
      return (java.lang.Boolean) value_;
    }
    return false;
  }

  public static final int INTVALUE_FIELD_NUMBER = 3;
  /**
   * <code>int32 intValue = 3;</code>
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return valueCase_ == 3;
  }
  /**
   * <code>int32 intValue = 3;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public int getIntValue() {
    if (valueCase_ == 3) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }

  public static final int DOUBLEVALUE_FIELD_NUMBER = 4;
  /**
   * <code>double doubleValue = 4;</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return valueCase_ == 4;
  }
  /**
   * <code>double doubleValue = 4;</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (valueCase_ == 4) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int STRINGVLAUE_FIELD_NUMBER = 5;
  /**
   * <code>string stringVlaue = 5;</code>
   * @return Whether the stringVlaue field is set.
   */
  public boolean hasStringVlaue() {
    return valueCase_ == 5;
  }
  /**
   * <code>string stringVlaue = 5;</code>
   * @return The stringVlaue.
   */
  public java.lang.String getStringVlaue() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 5) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string stringVlaue = 5;</code>
   * @return The bytes for stringVlaue.
   */
  public com.google.protobuf.ByteString
      getStringVlaueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 5) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (valueCase_ == 2) {
      output.writeBool(
          2, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 3) {
      output.writeInt32(
          3, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 4) {
      output.writeDouble(
          4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            2, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            3, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dev.igorxp5.proto.api.Value)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.Value other = (dev.igorxp5.proto.api.Value) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 2:
        if (getBoolValue()
            != other.getBoolValue()) return false;
        break;
      case 3:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 4:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 5:
        if (!getStringVlaue()
            .equals(other.getStringVlaue())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + BOOLVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 3:
        hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getIntValue();
        break;
      case 4:
        hash = (37 * hash) + DOUBLEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 5:
        hash = (37 * hash) + STRINGVLAUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringVlaue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dev.igorxp5.proto.api.Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Value)
      dev.igorxp5.proto.api.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.Value.class, dev.igorxp5.proto.api.Value.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.Value.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_Value_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Value getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.Value.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Value build() {
      dev.igorxp5.proto.api.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Value buildPartial() {
      dev.igorxp5.proto.api.Value result = new dev.igorxp5.proto.api.Value(this);
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dev.igorxp5.proto.api.Value) {
        return mergeFrom((dev.igorxp5.proto.api.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.Value other) {
      if (other == dev.igorxp5.proto.api.Value.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case BOOLVALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case INTVALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case DOUBLEVALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case STRINGVLAUE: {
          valueCase_ = 5;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dev.igorxp5.proto.api.Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>bool boolValue = 2;</code>
     * @return Whether the boolValue field is set.
     */
    public boolean hasBoolValue() {
      return valueCase_ == 2;
    }
    /**
     * <code>bool boolValue = 2;</code>
     * @return The boolValue.
     */
    public boolean getBoolValue() {
      if (valueCase_ == 2) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     * <code>bool boolValue = 2;</code>
     * @param value The boolValue to set.
     * @return This builder for chaining.
     */
    public Builder setBoolValue(boolean value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolValue = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoolValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 intValue = 3;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return valueCase_ == 3;
    }
    /**
     * <code>int32 intValue = 3;</code>
     * @return The intValue.
     */
    public int getIntValue() {
      if (valueCase_ == 3) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>int32 intValue = 3;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(int value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 intValue = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double doubleValue = 4;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return valueCase_ == 4;
    }
    /**
     * <code>double doubleValue = 4;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (valueCase_ == 4) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <code>double doubleValue = 4;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double doubleValue = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string stringVlaue = 5;</code>
     * @return Whether the stringVlaue field is set.
     */
    @java.lang.Override
    public boolean hasStringVlaue() {
      return valueCase_ == 5;
    }
    /**
     * <code>string stringVlaue = 5;</code>
     * @return The stringVlaue.
     */
    @java.lang.Override
    public java.lang.String getStringVlaue() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 5) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stringVlaue = 5;</code>
     * @return The bytes for stringVlaue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringVlaueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 5) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stringVlaue = 5;</code>
     * @param value The stringVlaue to set.
     * @return This builder for chaining.
     */
    public Builder setStringVlaue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stringVlaue = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringVlaue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string stringVlaue = 5;</code>
     * @param value The bytes for stringVlaue to set.
     * @return This builder for chaining.
     */
    public Builder setStringVlaueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Value)
  }

  // @@protoc_insertion_point(class_scope:Value)
  private static final dev.igorxp5.proto.api.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.Value();
  }

  public static dev.igorxp5.proto.api.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    @java.lang.Override
    public Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Value(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

