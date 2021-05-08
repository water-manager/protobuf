// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code CreateWaterTank}
 */
public final class CreateWaterTank extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateWaterTank)
    CreateWaterTankOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWaterTank.newBuilder() to construct.
  private CreateWaterTank(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWaterTank() {
    name_ = "";
    waterSourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWaterTank();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateWaterTank(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            name_ = s;
            break;
          }
          case 16: {

            volumeReaderPin_ = input.readUInt32();
            break;
          }
          case 25: {

            volumeFactor_ = input.readDouble();
            break;
          }
          case 33: {

            pressureFactor_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            waterSourceName_ = s;
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
    return dev.igorxp5.proto.api.Api.internal_static_CreateWaterTank_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_CreateWaterTank_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.CreateWaterTank.class, dev.igorxp5.proto.api.CreateWaterTank.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUMEREADERPIN_FIELD_NUMBER = 2;
  private int volumeReaderPin_;
  /**
   * <code>uint32 volumeReaderPin = 2;</code>
   * @return The volumeReaderPin.
   */
  @java.lang.Override
  public int getVolumeReaderPin() {
    return volumeReaderPin_;
  }

  public static final int VOLUMEFACTOR_FIELD_NUMBER = 3;
  private double volumeFactor_;
  /**
   * <code>double volumeFactor = 3;</code>
   * @return The volumeFactor.
   */
  @java.lang.Override
  public double getVolumeFactor() {
    return volumeFactor_;
  }

  public static final int PRESSUREFACTOR_FIELD_NUMBER = 4;
  private double pressureFactor_;
  /**
   * <code>double pressureFactor = 4;</code>
   * @return The pressureFactor.
   */
  @java.lang.Override
  public double getPressureFactor() {
    return pressureFactor_;
  }

  public static final int WATERSOURCENAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object waterSourceName_;
  /**
   * <code>string waterSourceName = 5;</code>
   * @return Whether the waterSourceName field is set.
   */
  @java.lang.Override
  public boolean hasWaterSourceName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>string waterSourceName = 5;</code>
   * @return The waterSourceName.
   */
  @java.lang.Override
  public java.lang.String getWaterSourceName() {
    java.lang.Object ref = waterSourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      waterSourceName_ = s;
      return s;
    }
  }
  /**
   * <code>string waterSourceName = 5;</code>
   * @return The bytes for waterSourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWaterSourceNameBytes() {
    java.lang.Object ref = waterSourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      waterSourceName_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (volumeReaderPin_ != 0) {
      output.writeUInt32(2, volumeReaderPin_);
    }
    if (volumeFactor_ != 0D) {
      output.writeDouble(3, volumeFactor_);
    }
    if (pressureFactor_ != 0D) {
      output.writeDouble(4, pressureFactor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, waterSourceName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (volumeReaderPin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, volumeReaderPin_);
    }
    if (volumeFactor_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, volumeFactor_);
    }
    if (pressureFactor_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, pressureFactor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, waterSourceName_);
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
    if (!(obj instanceof dev.igorxp5.proto.api.CreateWaterTank)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.CreateWaterTank other = (dev.igorxp5.proto.api.CreateWaterTank) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getVolumeReaderPin()
        != other.getVolumeReaderPin()) return false;
    if (java.lang.Double.doubleToLongBits(getVolumeFactor())
        != java.lang.Double.doubleToLongBits(
            other.getVolumeFactor())) return false;
    if (java.lang.Double.doubleToLongBits(getPressureFactor())
        != java.lang.Double.doubleToLongBits(
            other.getPressureFactor())) return false;
    if (hasWaterSourceName() != other.hasWaterSourceName()) return false;
    if (hasWaterSourceName()) {
      if (!getWaterSourceName()
          .equals(other.getWaterSourceName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VOLUMEREADERPIN_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeReaderPin();
    hash = (37 * hash) + VOLUMEFACTOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVolumeFactor()));
    hash = (37 * hash) + PRESSUREFACTOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPressureFactor()));
    if (hasWaterSourceName()) {
      hash = (37 * hash) + WATERSOURCENAME_FIELD_NUMBER;
      hash = (53 * hash) + getWaterSourceName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.CreateWaterTank parseFrom(
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
  public static Builder newBuilder(dev.igorxp5.proto.api.CreateWaterTank prototype) {
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
   * Protobuf type {@code CreateWaterTank}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateWaterTank)
      dev.igorxp5.proto.api.CreateWaterTankOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_CreateWaterTank_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_CreateWaterTank_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.CreateWaterTank.class, dev.igorxp5.proto.api.CreateWaterTank.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.CreateWaterTank.newBuilder()
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
      name_ = "";

      volumeReaderPin_ = 0;

      volumeFactor_ = 0D;

      pressureFactor_ = 0D;

      waterSourceName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_CreateWaterTank_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.CreateWaterTank getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.CreateWaterTank.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.CreateWaterTank build() {
      dev.igorxp5.proto.api.CreateWaterTank result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.CreateWaterTank buildPartial() {
      dev.igorxp5.proto.api.CreateWaterTank result = new dev.igorxp5.proto.api.CreateWaterTank(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.volumeReaderPin_ = volumeReaderPin_;
      result.volumeFactor_ = volumeFactor_;
      result.pressureFactor_ = pressureFactor_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.waterSourceName_ = waterSourceName_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof dev.igorxp5.proto.api.CreateWaterTank) {
        return mergeFrom((dev.igorxp5.proto.api.CreateWaterTank)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.CreateWaterTank other) {
      if (other == dev.igorxp5.proto.api.CreateWaterTank.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getVolumeReaderPin() != 0) {
        setVolumeReaderPin(other.getVolumeReaderPin());
      }
      if (other.getVolumeFactor() != 0D) {
        setVolumeFactor(other.getVolumeFactor());
      }
      if (other.getPressureFactor() != 0D) {
        setPressureFactor(other.getPressureFactor());
      }
      if (other.hasWaterSourceName()) {
        bitField0_ |= 0x00000001;
        waterSourceName_ = other.waterSourceName_;
        onChanged();
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
      dev.igorxp5.proto.api.CreateWaterTank parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.CreateWaterTank) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int volumeReaderPin_ ;
    /**
     * <code>uint32 volumeReaderPin = 2;</code>
     * @return The volumeReaderPin.
     */
    @java.lang.Override
    public int getVolumeReaderPin() {
      return volumeReaderPin_;
    }
    /**
     * <code>uint32 volumeReaderPin = 2;</code>
     * @param value The volumeReaderPin to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeReaderPin(int value) {
      
      volumeReaderPin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 volumeReaderPin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolumeReaderPin() {
      
      volumeReaderPin_ = 0;
      onChanged();
      return this;
    }

    private double volumeFactor_ ;
    /**
     * <code>double volumeFactor = 3;</code>
     * @return The volumeFactor.
     */
    @java.lang.Override
    public double getVolumeFactor() {
      return volumeFactor_;
    }
    /**
     * <code>double volumeFactor = 3;</code>
     * @param value The volumeFactor to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeFactor(double value) {
      
      volumeFactor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double volumeFactor = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolumeFactor() {
      
      volumeFactor_ = 0D;
      onChanged();
      return this;
    }

    private double pressureFactor_ ;
    /**
     * <code>double pressureFactor = 4;</code>
     * @return The pressureFactor.
     */
    @java.lang.Override
    public double getPressureFactor() {
      return pressureFactor_;
    }
    /**
     * <code>double pressureFactor = 4;</code>
     * @param value The pressureFactor to set.
     * @return This builder for chaining.
     */
    public Builder setPressureFactor(double value) {
      
      pressureFactor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double pressureFactor = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPressureFactor() {
      
      pressureFactor_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object waterSourceName_ = "";
    /**
     * <code>string waterSourceName = 5;</code>
     * @return Whether the waterSourceName field is set.
     */
    public boolean hasWaterSourceName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>string waterSourceName = 5;</code>
     * @return The waterSourceName.
     */
    public java.lang.String getWaterSourceName() {
      java.lang.Object ref = waterSourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        waterSourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string waterSourceName = 5;</code>
     * @return The bytes for waterSourceName.
     */
    public com.google.protobuf.ByteString
        getWaterSourceNameBytes() {
      java.lang.Object ref = waterSourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        waterSourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string waterSourceName = 5;</code>
     * @param value The waterSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterSourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      waterSourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string waterSourceName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearWaterSourceName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      waterSourceName_ = getDefaultInstance().getWaterSourceName();
      onChanged();
      return this;
    }
    /**
     * <code>string waterSourceName = 5;</code>
     * @param value The bytes for waterSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterSourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      waterSourceName_ = value;
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


    // @@protoc_insertion_point(builder_scope:CreateWaterTank)
  }

  // @@protoc_insertion_point(class_scope:CreateWaterTank)
  private static final dev.igorxp5.proto.api.CreateWaterTank DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.CreateWaterTank();
  }

  public static dev.igorxp5.proto.api.CreateWaterTank getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWaterTank>
      PARSER = new com.google.protobuf.AbstractParser<CreateWaterTank>() {
    @java.lang.Override
    public CreateWaterTank parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateWaterTank(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateWaterTank> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWaterTank> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.CreateWaterTank getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

