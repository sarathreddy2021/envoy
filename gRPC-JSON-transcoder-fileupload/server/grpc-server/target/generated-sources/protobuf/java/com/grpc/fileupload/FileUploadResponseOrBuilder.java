// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file/fileupload.proto

package com.grpc.fileupload;

public interface FileUploadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:file.FileUploadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.file.Status status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.file.Status status = 2;</code>
   * @return The status.
   */
  com.grpc.fileupload.Status getStatus();
}
