// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

/**
 * Protobuf type {@code Response}
 */
public final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Response();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Response(
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
          case 8: {

            id_ = input.readUInt32();
            break;
          }
          case 18: {
            dev.igorxp5.proto.api.Value.Builder subBuilder = null;
            if (contentCase_ == 2) {
              subBuilder = ((dev.igorxp5.proto.api.Value) content_).toBuilder();
            }
            content_ =
                input.readMessage(dev.igorxp5.proto.api.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((dev.igorxp5.proto.api.Value) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 2;
            break;
          }
          case 26: {
            dev.igorxp5.proto.api.Error.Builder subBuilder = null;
            if (contentCase_ == 3) {
              subBuilder = ((dev.igorxp5.proto.api.Error) content_).toBuilder();
            }
            content_ =
                input.readMessage(dev.igorxp5.proto.api.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((dev.igorxp5.proto.api.Error) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 3;
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
    return dev.igorxp5.proto.api.Api.internal_static_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.igorxp5.proto.api.Api.internal_static_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.igorxp5.proto.api.Response.class, dev.igorxp5.proto.api.Response.Builder.class);
  }

  private int contentCase_ = 0;
  private java.lang.Object content_;
  public enum ContentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MESSAGE(2),
    ERROR(3),
    CONTENT_NOT_SET(0);
    private final int value;
    private ContentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentCase forNumber(int value) {
      switch (value) {
        case 2: return MESSAGE;
        case 3: return ERROR;
        case 0: return CONTENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContentCase
  getContentCase() {
    return ContentCase.forNumber(
        contentCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>uint32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  /**
   * <code>.Value message = 2;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return contentCase_ == 2;
  }
  /**
   * <code>.Value message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public dev.igorxp5.proto.api.Value getMessage() {
    if (contentCase_ == 2) {
       return (dev.igorxp5.proto.api.Value) content_;
    }
    return dev.igorxp5.proto.api.Value.getDefaultInstance();
  }
  /**
   * <code>.Value message = 2;</code>
   */
  @java.lang.Override
  public dev.igorxp5.proto.api.ValueOrBuilder getMessageOrBuilder() {
    if (contentCase_ == 2) {
       return (dev.igorxp5.proto.api.Value) content_;
    }
    return dev.igorxp5.proto.api.Value.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  /**
   * <code>.Error error = 3;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return contentCase_ == 3;
  }
  /**
   * <code>.Error error = 3;</code>
   * @return The error.
   */
  @java.lang.Override
  public dev.igorxp5.proto.api.Error getError() {
    if (contentCase_ == 3) {
       return (dev.igorxp5.proto.api.Error) content_;
    }
    return dev.igorxp5.proto.api.Error.getDefaultInstance();
  }
  /**
   * <code>.Error error = 3;</code>
   */
  @java.lang.Override
  public dev.igorxp5.proto.api.ErrorOrBuilder getErrorOrBuilder() {
    if (contentCase_ == 3) {
       return (dev.igorxp5.proto.api.Error) content_;
    }
    return dev.igorxp5.proto.api.Error.getDefaultInstance();
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
    if (id_ != 0) {
      output.writeUInt32(1, id_);
    }
    if (contentCase_ == 2) {
      output.writeMessage(2, (dev.igorxp5.proto.api.Value) content_);
    }
    if (contentCase_ == 3) {
      output.writeMessage(3, (dev.igorxp5.proto.api.Error) content_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
    }
    if (contentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (dev.igorxp5.proto.api.Value) content_);
    }
    if (contentCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (dev.igorxp5.proto.api.Error) content_);
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
    if (!(obj instanceof dev.igorxp5.proto.api.Response)) {
      return super.equals(obj);
    }
    dev.igorxp5.proto.api.Response other = (dev.igorxp5.proto.api.Response) obj;

    if (getId()
        != other.getId()) return false;
    if (!getContentCase().equals(other.getContentCase())) return false;
    switch (contentCase_) {
      case 2:
        if (!getMessage()
            .equals(other.getMessage())) return false;
        break;
      case 3:
        if (!getError()
            .equals(other.getError())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    switch (contentCase_) {
      case 2:
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.igorxp5.proto.api.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.igorxp5.proto.api.Response parseFrom(
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
  public static Builder newBuilder(dev.igorxp5.proto.api.Response prototype) {
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
   * Protobuf type {@code Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Response)
      dev.igorxp5.proto.api.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.igorxp5.proto.api.Api.internal_static_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.igorxp5.proto.api.Api.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.igorxp5.proto.api.Response.class, dev.igorxp5.proto.api.Response.Builder.class);
    }

    // Construct using dev.igorxp5.proto.api.Response.newBuilder()
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
      id_ = 0;

      contentCase_ = 0;
      content_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.igorxp5.proto.api.Api.internal_static_Response_descriptor;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Response getDefaultInstanceForType() {
      return dev.igorxp5.proto.api.Response.getDefaultInstance();
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Response build() {
      dev.igorxp5.proto.api.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.igorxp5.proto.api.Response buildPartial() {
      dev.igorxp5.proto.api.Response result = new dev.igorxp5.proto.api.Response(this);
      result.id_ = id_;
      if (contentCase_ == 2) {
        if (messageBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = messageBuilder_.build();
        }
      }
      if (contentCase_ == 3) {
        if (errorBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = errorBuilder_.build();
        }
      }
      result.contentCase_ = contentCase_;
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
      if (other instanceof dev.igorxp5.proto.api.Response) {
        return mergeFrom((dev.igorxp5.proto.api.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.igorxp5.proto.api.Response other) {
      if (other == dev.igorxp5.proto.api.Response.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      switch (other.getContentCase()) {
        case MESSAGE: {
          mergeMessage(other.getMessage());
          break;
        }
        case ERROR: {
          mergeError(other.getError());
          break;
        }
        case CONTENT_NOT_SET: {
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
      dev.igorxp5.proto.api.Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.igorxp5.proto.api.Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int contentCase_ = 0;
    private java.lang.Object content_;
    public ContentCase
        getContentCase() {
      return ContentCase.forNumber(
          contentCase_);
    }

    public Builder clearContent() {
      contentCase_ = 0;
      content_ = null;
      onChanged();
      return this;
    }


    private int id_ ;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>uint32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        dev.igorxp5.proto.api.Value, dev.igorxp5.proto.api.Value.Builder, dev.igorxp5.proto.api.ValueOrBuilder> messageBuilder_;
    /**
     * <code>.Value message = 2;</code>
     * @return Whether the message field is set.
     */
    @java.lang.Override
    public boolean hasMessage() {
      return contentCase_ == 2;
    }
    /**
     * <code>.Value message = 2;</code>
     * @return The message.
     */
    @java.lang.Override
    public dev.igorxp5.proto.api.Value getMessage() {
      if (messageBuilder_ == null) {
        if (contentCase_ == 2) {
          return (dev.igorxp5.proto.api.Value) content_;
        }
        return dev.igorxp5.proto.api.Value.getDefaultInstance();
      } else {
        if (contentCase_ == 2) {
          return messageBuilder_.getMessage();
        }
        return dev.igorxp5.proto.api.Value.getDefaultInstance();
      }
    }
    /**
     * <code>.Value message = 2;</code>
     */
    public Builder setMessage(dev.igorxp5.proto.api.Value value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <code>.Value message = 2;</code>
     */
    public Builder setMessage(
        dev.igorxp5.proto.api.Value.Builder builderForValue) {
      if (messageBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <code>.Value message = 2;</code>
     */
    public Builder mergeMessage(dev.igorxp5.proto.api.Value value) {
      if (messageBuilder_ == null) {
        if (contentCase_ == 2 &&
            content_ != dev.igorxp5.proto.api.Value.getDefaultInstance()) {
          content_ = dev.igorxp5.proto.api.Value.newBuilder((dev.igorxp5.proto.api.Value) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 2) {
          messageBuilder_.mergeFrom(value);
        }
        messageBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <code>.Value message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
        }
        messageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Value message = 2;</code>
     */
    public dev.igorxp5.proto.api.Value.Builder getMessageBuilder() {
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.Value message = 2;</code>
     */
    @java.lang.Override
    public dev.igorxp5.proto.api.ValueOrBuilder getMessageOrBuilder() {
      if ((contentCase_ == 2) && (messageBuilder_ != null)) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 2) {
          return (dev.igorxp5.proto.api.Value) content_;
        }
        return dev.igorxp5.proto.api.Value.getDefaultInstance();
      }
    }
    /**
     * <code>.Value message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.igorxp5.proto.api.Value, dev.igorxp5.proto.api.Value.Builder, dev.igorxp5.proto.api.ValueOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        if (!(contentCase_ == 2)) {
          content_ = dev.igorxp5.proto.api.Value.getDefaultInstance();
        }
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dev.igorxp5.proto.api.Value, dev.igorxp5.proto.api.Value.Builder, dev.igorxp5.proto.api.ValueOrBuilder>(
                (dev.igorxp5.proto.api.Value) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 2;
      onChanged();;
      return messageBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        dev.igorxp5.proto.api.Error, dev.igorxp5.proto.api.Error.Builder, dev.igorxp5.proto.api.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.Error error = 3;</code>
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return contentCase_ == 3;
    }
    /**
     * <code>.Error error = 3;</code>
     * @return The error.
     */
    @java.lang.Override
    public dev.igorxp5.proto.api.Error getError() {
      if (errorBuilder_ == null) {
        if (contentCase_ == 3) {
          return (dev.igorxp5.proto.api.Error) content_;
        }
        return dev.igorxp5.proto.api.Error.getDefaultInstance();
      } else {
        if (contentCase_ == 3) {
          return errorBuilder_.getMessage();
        }
        return dev.igorxp5.proto.api.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.Error error = 3;</code>
     */
    public Builder setError(dev.igorxp5.proto.api.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <code>.Error error = 3;</code>
     */
    public Builder setError(
        dev.igorxp5.proto.api.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <code>.Error error = 3;</code>
     */
    public Builder mergeError(dev.igorxp5.proto.api.Error value) {
      if (errorBuilder_ == null) {
        if (contentCase_ == 3 &&
            content_ != dev.igorxp5.proto.api.Error.getDefaultInstance()) {
          content_ = dev.igorxp5.proto.api.Error.newBuilder((dev.igorxp5.proto.api.Error) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 3) {
          errorBuilder_.mergeFrom(value);
        }
        errorBuilder_.setMessage(value);
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <code>.Error error = 3;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Error error = 3;</code>
     */
    public dev.igorxp5.proto.api.Error.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.Error error = 3;</code>
     */
    @java.lang.Override
    public dev.igorxp5.proto.api.ErrorOrBuilder getErrorOrBuilder() {
      if ((contentCase_ == 3) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 3) {
          return (dev.igorxp5.proto.api.Error) content_;
        }
        return dev.igorxp5.proto.api.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.Error error = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.igorxp5.proto.api.Error, dev.igorxp5.proto.api.Error.Builder, dev.igorxp5.proto.api.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(contentCase_ == 3)) {
          content_ = dev.igorxp5.proto.api.Error.getDefaultInstance();
        }
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dev.igorxp5.proto.api.Error, dev.igorxp5.proto.api.Error.Builder, dev.igorxp5.proto.api.ErrorOrBuilder>(
                (dev.igorxp5.proto.api.Error) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 3;
      onChanged();;
      return errorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Response)
  }

  // @@protoc_insertion_point(class_scope:Response)
  private static final dev.igorxp5.proto.api.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.igorxp5.proto.api.Response();
  }

  public static dev.igorxp5.proto.api.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.igorxp5.proto.api.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

