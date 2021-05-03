// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code SetWaterSourceState}
 */
public final class SetWaterSourceState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetWaterSourceState)
    SetWaterSourceStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetWaterSourceState.newBuilder() to construct.
  private SetWaterSourceState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetWaterSourceState() {
    waterSourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetWaterSourceState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetWaterSourceState(
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

            state_ = input.readBool();
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
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.SetWaterSourceState.class, dev.igorxp5.proto.api.SetWaterSourceState.Builder.class);
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

  public static final int STATE_FIELD_NUMBER = 2;
  private boolean state_;
  /**
   * <code>bool state = 2;</code>
   * @return The state.
   */
  @java.lang.Override
  public boolean getState() {
    return state_;
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
    if (!getWaterSourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, waterSourceName_);
    }
    if (state_ != false) {
      output.writeBool(2, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWaterSourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, waterSourceName_);
    }
    if (state_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, state_);
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
    if (!(obj instanceof dev.igorxp5.proto.api.SetWaterSourceState)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.SetWaterSourceState other = (dev.igorxp5.proto.api.SetWaterSourceState) obj;

    if (!getWaterSourceName()
        .equals(other.getWaterSourceName())) return false;
    if (getState()
        != other.getState()) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getState());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.SetWaterSourceState parseFrom(
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
  public static Builder newBuilder(dev.igorxp5.proto.api.SetWaterSourceState prototype) {
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
   * Protobuf type {@code SetWaterSourceState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetWaterSourceState)
      dev.igorxp5.proto.api.SetWaterSourceStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.SetWaterSourceState.class, dev.igorxp5.proto.api.SetWaterSourceState.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.SetWaterSourceState.newBuilder()
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

      state_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_SetWaterSourceState_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceState getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.SetWaterSourceState.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceState build() {
      dev.igorxp5.proto.api.SetWaterSourceState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.SetWaterSourceState buildPartial() {
      dev.igorxp5.proto.api.SetWaterSourceState result = new dev.igorxp5.proto.api.SetWaterSourceState(this);
      result.waterSourceName_ = waterSourceName_;
      result.state_ = state_;
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
      if (other instanceof dev.igorxp5.proto.api.SetWaterSourceState) {
        return mergeFrom((dev.igorxp5.proto.api.SetWaterSourceState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.SetWaterSourceState other) {
      if (other == dev.igorxp5.proto.api.SetWaterSourceState.getDefaultInstance()) return this;
      if (!other.getWaterSourceName().isEmpty()) {
        waterSourceName_ = other.waterSourceName_;
        onChanged();
      }
      if (other.getState() != false) {
        setState(other.getState());
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
      dev.igorxp5.proto.api.SetWaterSourceState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.SetWaterSourceState) e.getUnfinishedMessage();
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

    private boolean state_ ;
    /**
     * <code>bool state = 2;</code>
     * @return The state.
     */
    @java.lang.Override
    public boolean getState() {
      return state_;
    }
    /**
     * <code>bool state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(boolean value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = false;
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


    // @@protoc_insertion_point(builder_scope:SetWaterSourceState)
  }

  // @@protoc_insertion_point(class_scope:SetWaterSourceState)
  private static final dev.igorxp5.proto.api.SetWaterSourceState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.SetWaterSourceState();
  }

  public static dev.igorxp5.proto.api.SetWaterSourceState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetWaterSourceState>
      PARSER = new com.google.protobuf.AbstractParser<SetWaterSourceState>() {
    @java.lang.Override
    public SetWaterSourceState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetWaterSourceState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetWaterSourceState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetWaterSourceState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.SetWaterSourceState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

