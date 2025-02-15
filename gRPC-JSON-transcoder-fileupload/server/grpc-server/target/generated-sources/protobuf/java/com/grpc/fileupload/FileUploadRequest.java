// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file/fileupload.proto

package com.grpc.fileupload;

/**
 * Protobuf type {@code file.FileUploadRequest}
 */
public final class FileUploadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:file.FileUploadRequest)
    FileUploadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileUploadRequest.newBuilder() to construct.
  private FileUploadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileUploadRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileUploadRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileUploadRequest(
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
            com.grpc.fileupload.File.Builder subBuilder = null;
            if (file_ != null) {
              subBuilder = file_.toBuilder();
            }
            file_ = input.readMessage(com.grpc.fileupload.File.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(file_);
              file_ = subBuilder.buildPartial();
            }

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
    return com.grpc.fileupload.Fileupload.internal_static_file_FileUploadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.fileupload.Fileupload.internal_static_file_FileUploadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.fileupload.FileUploadRequest.class, com.grpc.fileupload.FileUploadRequest.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  private com.grpc.fileupload.File file_;
  /**
   * <code>.file.File file = 1;</code>
   * @return Whether the file field is set.
   */
  @java.lang.Override
  public boolean hasFile() {
    return file_ != null;
  }
  /**
   * <code>.file.File file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public com.grpc.fileupload.File getFile() {
    return file_ == null ? com.grpc.fileupload.File.getDefaultInstance() : file_;
  }
  /**
   * <code>.file.File file = 1;</code>
   */
  @java.lang.Override
  public com.grpc.fileupload.FileOrBuilder getFileOrBuilder() {
    return getFile();
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
    if (file_ != null) {
      output.writeMessage(1, getFile());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (file_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFile());
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
    if (!(obj instanceof com.grpc.fileupload.FileUploadRequest)) {
      return super.equals(obj);
    }
    com.grpc.fileupload.FileUploadRequest other = (com.grpc.fileupload.FileUploadRequest) obj;

    if (hasFile() != other.hasFile()) return false;
    if (hasFile()) {
      if (!getFile()
          .equals(other.getFile())) return false;
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
    if (hasFile()) {
      hash = (37 * hash) + FILE_FIELD_NUMBER;
      hash = (53 * hash) + getFile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.fileupload.FileUploadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.fileupload.FileUploadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.fileupload.FileUploadRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.fileupload.FileUploadRequest prototype) {
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
   * Protobuf type {@code file.FileUploadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:file.FileUploadRequest)
      com.grpc.fileupload.FileUploadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.fileupload.Fileupload.internal_static_file_FileUploadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.fileupload.Fileupload.internal_static_file_FileUploadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.fileupload.FileUploadRequest.class, com.grpc.fileupload.FileUploadRequest.Builder.class);
    }

    // Construct using com.grpc.fileupload.FileUploadRequest.newBuilder()
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
      if (fileBuilder_ == null) {
        file_ = null;
      } else {
        file_ = null;
        fileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.fileupload.Fileupload.internal_static_file_FileUploadRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.fileupload.FileUploadRequest getDefaultInstanceForType() {
      return com.grpc.fileupload.FileUploadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.fileupload.FileUploadRequest build() {
      com.grpc.fileupload.FileUploadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.fileupload.FileUploadRequest buildPartial() {
      com.grpc.fileupload.FileUploadRequest result = new com.grpc.fileupload.FileUploadRequest(this);
      if (fileBuilder_ == null) {
        result.file_ = file_;
      } else {
        result.file_ = fileBuilder_.build();
      }
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
      if (other instanceof com.grpc.fileupload.FileUploadRequest) {
        return mergeFrom((com.grpc.fileupload.FileUploadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.fileupload.FileUploadRequest other) {
      if (other == com.grpc.fileupload.FileUploadRequest.getDefaultInstance()) return this;
      if (other.hasFile()) {
        mergeFile(other.getFile());
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
      com.grpc.fileupload.FileUploadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.fileupload.FileUploadRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpc.fileupload.File file_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.fileupload.File, com.grpc.fileupload.File.Builder, com.grpc.fileupload.FileOrBuilder> fileBuilder_;
    /**
     * <code>.file.File file = 1;</code>
     * @return Whether the file field is set.
     */
    public boolean hasFile() {
      return fileBuilder_ != null || file_ != null;
    }
    /**
     * <code>.file.File file = 1;</code>
     * @return The file.
     */
    public com.grpc.fileupload.File getFile() {
      if (fileBuilder_ == null) {
        return file_ == null ? com.grpc.fileupload.File.getDefaultInstance() : file_;
      } else {
        return fileBuilder_.getMessage();
      }
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public Builder setFile(com.grpc.fileupload.File value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        file_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public Builder setFile(
        com.grpc.fileupload.File.Builder builderForValue) {
      if (fileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public Builder mergeFile(com.grpc.fileupload.File value) {
      if (fileBuilder_ == null) {
        if (file_ != null) {
          file_ =
            com.grpc.fileupload.File.newBuilder(file_).mergeFrom(value).buildPartial();
        } else {
          file_ = value;
        }
        onChanged();
      } else {
        fileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        file_ = null;
        onChanged();
      } else {
        file_ = null;
        fileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public com.grpc.fileupload.File.Builder getFileBuilder() {
      
      onChanged();
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    public com.grpc.fileupload.FileOrBuilder getFileOrBuilder() {
      if (fileBuilder_ != null) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        return file_ == null ?
            com.grpc.fileupload.File.getDefaultInstance() : file_;
      }
    }
    /**
     * <code>.file.File file = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.fileupload.File, com.grpc.fileupload.File.Builder, com.grpc.fileupload.FileOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        fileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.fileupload.File, com.grpc.fileupload.File.Builder, com.grpc.fileupload.FileOrBuilder>(
                getFile(),
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      return fileBuilder_;
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


    // @@protoc_insertion_point(builder_scope:file.FileUploadRequest)
  }

  // @@protoc_insertion_point(class_scope:file.FileUploadRequest)
  private static final com.grpc.fileupload.FileUploadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.fileupload.FileUploadRequest();
  }

  public static com.grpc.fileupload.FileUploadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileUploadRequest>
      PARSER = new com.google.protobuf.AbstractParser<FileUploadRequest>() {
    @java.lang.Override
    public FileUploadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileUploadRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileUploadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileUploadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.fileupload.FileUploadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

