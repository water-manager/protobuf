// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code SetWaterTankZeroVolume}
 */
public final class SetWaterTankZeroVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetWaterTankZeroVolume)
    SetWaterTankZeroVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetWaterTankZeroVolume.newBuilder() to construct.
  private SetWaterTankZeroVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetWaterTankZeroVolume() {
    waterTankName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetWaterTankZeroVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetWaterTankZeroVolume(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            waterTankName_ = s;
            break;
          }
          case 21: {

            value_ = input.readFloat();
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
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterTankZeroVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterTankZeroVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.SetWaterTankZeroVolume.class, dev.igorxp5.proto.api.SetWaterTankZeroVolume.Builder.class);
  }

  public static final int WATERTANKNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object waterTankName_;
  /**
   * <code>string waterTankName = 1;</code>
   * @return The waterTankName.
   */
  @java.lang.Override
  public java.lang.String getWaterTankName() {
    java.lang.Object ref = waterTankName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      waterTankName_ = s;
      return s;
    }
  }
  /**
   * <code>string waterTankName = 1;</code>
   * @return The bytes for waterTankName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWaterTankNameBytes() {
    java.lang.Object ref = waterTankName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      waterTankName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private float value_;
  /**
   * <code>float value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public float getValue() {
    return value_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(waterTankName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, waterTankName_);
    }
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      output.writeFloat(2, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(waterTankName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, waterTankName_);
    }
    if (java.lang.Float.floatToRawIntBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, value_);
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
    if (!(obj instanceof dev.igorxp5.proto.api.SetWaterTankZeroVolume)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.SetWaterTankZeroVolume other = (dev.igorxp5.proto.api.SetWaterTankZeroVolume) obj;

    if (!getWaterTankName()
        .equals(other.getWaterTankName())) return false;
    if (java.lang.Float.floatToIntBits(getValue())
        != java.lang.Float.floatToIntBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + WATERTANKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getWaterTankName().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume parseFrom(
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
  public static Builder newBuilder(dev.igorxp5.proto.api.SetWaterTankZeroVolume prototype) {
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
   * Protobuf type {@code SetWaterTankZeroVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetWaterTankZeroVolume)
      dev.igorxp5.proto.api.SetWaterTankZeroVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterTankZeroVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterTankZeroVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.SetWaterTankZeroVolume.class, dev.igorxp5.proto.api.SetWaterTankZeroVolume.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.SetWaterTankZeroVolume.newBuilder()
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
      waterTankName_ = "";

      value_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterTankZeroVolume_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterTankZeroVolume getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.SetWaterTankZeroVolume.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterTankZeroVolume build() {
      dev.igorxp5.proto.api.SetWaterTankZeroVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterTankZeroVolume buildPartial() {
      dev.igorxp5.proto.api.SetWaterTankZeroVolume result = new dev.igorxp5.proto.api.SetWaterTankZeroVolume(this);
      result.waterTankName_ = waterTankName_;
      result.value_ = value_;
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
      if (other instanceof dev.igorxp5.proto.api.SetWaterTankZeroVolume) {
        return mergeFrom((dev.igorxp5.proto.api.SetWaterTankZeroVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.SetWaterTankZeroVolume other) {
      if (other == dev.igorxp5.proto.api.SetWaterTankZeroVolume.getDefaultInstance()) return this;
      if (!other.getWaterTankName().isEmpty()) {
        waterTankName_ = other.waterTankName_;
        onChanged();
      }
      if (other.getValue() != 0F) {
        setValue(other.getValue());
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
      dev.igorxp5.proto.api.SetWaterTankZeroVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.SetWaterTankZeroVolume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object waterTankName_ = "";
    /**
     * <code>string waterTankName = 1;</code>
     * @return The waterTankName.
     */
    public java.lang.String getWaterTankName() {
      java.lang.Object ref = waterTankName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        waterTankName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string waterTankName = 1;</code>
     * @return The bytes for waterTankName.
     */
    public com.google.protobuf.ByteString
        getWaterTankNameBytes() {
      java.lang.Object ref = waterTankName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        waterTankName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string waterTankName = 1;</code>
     * @param value The waterTankName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterTankName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      waterTankName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string waterTankName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWaterTankName() {
      
      waterTankName_ = getDefaultInstance().getWaterTankName();
      onChanged();
      return this;
    }
    /**
     * <code>string waterTankName = 1;</code>
     * @param value The bytes for waterTankName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterTankNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      waterTankName_ = value;
      onChanged();
      return this;
    }

    private float value_ ;
    /**
     * <code>float value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }
    /**
     * <code>float value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:SetWaterTankZeroVolume)
  }

  // @@protoc_insertion_point(class_scope:SetWaterTankZeroVolume)
  private static final dev.igorxp5.proto.api.SetWaterTankZeroVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.SetWaterTankZeroVolume();
  }

  public static dev.igorxp5.proto.api.SetWaterTankZeroVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetWaterTankZeroVolume>
      PARSER = new com.google.protobuf.AbstractParser<SetWaterTankZeroVolume>() {
    @java.lang.Override
    public SetWaterTankZeroVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetWaterTankZeroVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetWaterTankZeroVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetWaterTankZeroVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.SetWaterTankZeroVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

