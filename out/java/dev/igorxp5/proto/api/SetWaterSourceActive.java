// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code SetWaterSourceActive}
 */
public final class SetWaterSourceActive extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetWaterSourceActive)
    SetWaterSourceActiveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetWaterSourceActive.newBuilder() to construct.
  private SetWaterSourceActive(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetWaterSourceActive() {
    waterSourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetWaterSourceActive();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetWaterSourceActive(
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

            waterSourceName_ = s;
            break;
          }
          case 16: {

            active_ = input.readBool();
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
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceActive_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceActive_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.SetWaterSourceActive.class, dev.igorxp5.proto.api.SetWaterSourceActive.Builder.class);
  }

  public static final int WATERSOURCENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object waterSourceName_;
  /**
   * <code>string waterSourceName = 1;</code>
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
   * <code>string waterSourceName = 1;</code>
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

  public static final int ACTIVE_FIELD_NUMBER = 2;
  private boolean active_;
  /**
   * <code>bool active = 2;</code>
   * @return The active.
   */
  @java.lang.Override
  public boolean getActive() {
    return active_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(waterSourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, waterSourceName_);
    }
    if (active_ != false) {
      output.writeBool(2, active_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(waterSourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, waterSourceName_);
    }
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, active_);
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
    if (!(obj instanceof dev.igorxp5.proto.api.SetWaterSourceActive)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.SetWaterSourceActive other = (dev.igorxp5.proto.api.SetWaterSourceActive) obj;

    if (!getWaterSourceName()
        .equals(other.getWaterSourceName())) return false;
    if (getActive()
        != other.getActive()) return false;
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
    hash = (37 * hash) + WATERSOURCENAME_FIELD_NUMBER;
    hash = (53 * hash) + getWaterSourceName().hashCode();
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceActive parseFrom(
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
  public static Builder newBuilder(dev.igorxp5.proto.api.SetWaterSourceActive prototype) {
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
   * Protobuf type {@code SetWaterSourceActive}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetWaterSourceActive)
      dev.igorxp5.proto.api.SetWaterSourceActiveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceActive_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceActive_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.SetWaterSourceActive.class, dev.igorxp5.proto.api.SetWaterSourceActive.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.SetWaterSourceActive.newBuilder()
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
      waterSourceName_ = "";

      active_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceActive_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceActive getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.SetWaterSourceActive.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceActive build() {
      dev.igorxp5.proto.api.SetWaterSourceActive result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceActive buildPartial() {
      dev.igorxp5.proto.api.SetWaterSourceActive result = new dev.igorxp5.proto.api.SetWaterSourceActive(this);
      result.waterSourceName_ = waterSourceName_;
      result.active_ = active_;
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
      if (other instanceof dev.igorxp5.proto.api.SetWaterSourceActive) {
        return mergeFrom((dev.igorxp5.proto.api.SetWaterSourceActive)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.SetWaterSourceActive other) {
      if (other == dev.igorxp5.proto.api.SetWaterSourceActive.getDefaultInstance()) return this;
      if (!other.getWaterSourceName().isEmpty()) {
        waterSourceName_ = other.waterSourceName_;
        onChanged();
      }
      if (other.getActive() != false) {
        setActive(other.getActive());
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
      dev.igorxp5.proto.api.SetWaterSourceActive parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.SetWaterSourceActive) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object waterSourceName_ = "";
    /**
     * <code>string waterSourceName = 1;</code>
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
     * <code>string waterSourceName = 1;</code>
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
     * <code>string waterSourceName = 1;</code>
     * @param value The waterSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterSourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      waterSourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string waterSourceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWaterSourceName() {
      
      waterSourceName_ = getDefaultInstance().getWaterSourceName();
      onChanged();
      return this;
    }
    /**
     * <code>string waterSourceName = 1;</code>
     * @param value The bytes for waterSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setWaterSourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      waterSourceName_ = value;
      onChanged();
      return this;
    }

    private boolean active_ ;
    /**
     * <code>bool active = 2;</code>
     * @return The active.
     */
    @java.lang.Override
    public boolean getActive() {
      return active_;
    }
    /**
     * <code>bool active = 2;</code>
     * @param value The active to set.
     * @return This builder for chaining.
     */
    public Builder setActive(boolean value) {
      
      active_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool active = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActive() {
      
      active_ = false;
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


    // @@protoc_insertion_point(builder_scope:SetWaterSourceActive)
  }

  // @@protoc_insertion_point(class_scope:SetWaterSourceActive)
  private static final dev.igorxp5.proto.api.SetWaterSourceActive DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.SetWaterSourceActive();
  }

  public static dev.igorxp5.proto.api.SetWaterSourceActive getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetWaterSourceActive>
      PARSER = new com.google.protobuf.AbstractParser<SetWaterSourceActive>() {
    @java.lang.Override
    public SetWaterSourceActive parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetWaterSourceActive(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetWaterSourceActive> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetWaterSourceActive> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.SetWaterSourceActive getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
