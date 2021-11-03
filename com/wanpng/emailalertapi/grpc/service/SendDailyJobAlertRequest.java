// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_email_alert_service.proto

package com.wanpng.emailalertapi.grpc.service;

/**
 * Protobuf type {@code protos.service.SendDailyJobAlertRequest}
 */
public final class SendDailyJobAlertRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.SendDailyJobAlertRequest)
    SendDailyJobAlertRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendDailyJobAlertRequest.newBuilder() to construct.
  private SendDailyJobAlertRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendDailyJobAlertRequest() {
    subject_ = "";
    dailyJobAlerts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendDailyJobAlertRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendDailyJobAlertRequest(
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

            subject_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dailyJobAlerts_ = new java.util.ArrayList<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert>();
              mutable_bitField0_ |= 0x00000001;
            }
            dailyJobAlerts_.add(
                input.readMessage(com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dailyJobAlerts_ = java.util.Collections.unmodifiableList(dailyJobAlerts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.internal_static_protos_service_SendDailyJobAlertRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.internal_static_protos_service_SendDailyJobAlertRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.class, com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.Builder.class);
  }

  public static final int SUBJECT_FIELD_NUMBER = 1;
  private volatile java.lang.Object subject_;
  /**
   * <code>string subject = 1;</code>
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subject_ = s;
      return s;
    }
  }
  /**
   * <code>string subject = 1;</code>
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAILY_JOB_ALERTS_FIELD_NUMBER = 2;
  private java.util.List<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert> dailyJobAlerts_;
  /**
   * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert> getDailyJobAlertsList() {
    return dailyJobAlerts_;
  }
  /**
   * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder> 
      getDailyJobAlertsOrBuilderList() {
    return dailyJobAlerts_;
  }
  /**
   * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
   */
  @java.lang.Override
  public int getDailyJobAlertsCount() {
    return dailyJobAlerts_.size();
  }
  /**
   * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
   */
  @java.lang.Override
  public com.wanpng.emailalertapi.grpc.domain.DailyJobAlert getDailyJobAlerts(int index) {
    return dailyJobAlerts_.get(index);
  }
  /**
   * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
   */
  @java.lang.Override
  public com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder getDailyJobAlertsOrBuilder(
      int index) {
    return dailyJobAlerts_.get(index);
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
    if (!getSubjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subject_);
    }
    for (int i = 0; i < dailyJobAlerts_.size(); i++) {
      output.writeMessage(2, dailyJobAlerts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subject_);
    }
    for (int i = 0; i < dailyJobAlerts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dailyJobAlerts_.get(i));
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
    if (!(obj instanceof com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest)) {
      return super.equals(obj);
    }
    com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest other = (com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest) obj;

    if (!getSubject()
        .equals(other.getSubject())) return false;
    if (!getDailyJobAlertsList()
        .equals(other.getDailyJobAlertsList())) return false;
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
    hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getSubject().hashCode();
    if (getDailyJobAlertsCount() > 0) {
      hash = (37 * hash) + DAILY_JOB_ALERTS_FIELD_NUMBER;
      hash = (53 * hash) + getDailyJobAlertsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parseFrom(
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
  public static Builder newBuilder(com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest prototype) {
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
   * Protobuf type {@code protos.service.SendDailyJobAlertRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.SendDailyJobAlertRequest)
      com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.internal_static_protos_service_SendDailyJobAlertRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.internal_static_protos_service_SendDailyJobAlertRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.class, com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.Builder.class);
    }

    // Construct using com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.newBuilder()
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
        getDailyJobAlertsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      subject_ = "";

      if (dailyJobAlertsBuilder_ == null) {
        dailyJobAlerts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dailyJobAlertsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.internal_static_protos_service_SendDailyJobAlertRequest_descriptor;
    }

    @java.lang.Override
    public com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest getDefaultInstanceForType() {
      return com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest build() {
      com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest buildPartial() {
      com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest result = new com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest(this);
      int from_bitField0_ = bitField0_;
      result.subject_ = subject_;
      if (dailyJobAlertsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dailyJobAlerts_ = java.util.Collections.unmodifiableList(dailyJobAlerts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dailyJobAlerts_ = dailyJobAlerts_;
      } else {
        result.dailyJobAlerts_ = dailyJobAlertsBuilder_.build();
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
      if (other instanceof com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest) {
        return mergeFrom((com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest other) {
      if (other == com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest.getDefaultInstance()) return this;
      if (!other.getSubject().isEmpty()) {
        subject_ = other.subject_;
        onChanged();
      }
      if (dailyJobAlertsBuilder_ == null) {
        if (!other.dailyJobAlerts_.isEmpty()) {
          if (dailyJobAlerts_.isEmpty()) {
            dailyJobAlerts_ = other.dailyJobAlerts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDailyJobAlertsIsMutable();
            dailyJobAlerts_.addAll(other.dailyJobAlerts_);
          }
          onChanged();
        }
      } else {
        if (!other.dailyJobAlerts_.isEmpty()) {
          if (dailyJobAlertsBuilder_.isEmpty()) {
            dailyJobAlertsBuilder_.dispose();
            dailyJobAlertsBuilder_ = null;
            dailyJobAlerts_ = other.dailyJobAlerts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dailyJobAlertsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDailyJobAlertsFieldBuilder() : null;
          } else {
            dailyJobAlertsBuilder_.addAllMessages(other.dailyJobAlerts_);
          }
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
      com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object subject_ = "";
    /**
     * <code>string subject = 1;</code>
     * @return The subject.
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject = 1;</code>
     * @return The bytes for subject.
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject = 1;</code>
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      
      subject_ = getDefaultInstance().getSubject();
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 1;</code>
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subject_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert> dailyJobAlerts_ =
      java.util.Collections.emptyList();
    private void ensureDailyJobAlertsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dailyJobAlerts_ = new java.util.ArrayList<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert>(dailyJobAlerts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.emailalertapi.grpc.domain.DailyJobAlert, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder, com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder> dailyJobAlertsBuilder_;

    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public java.util.List<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert> getDailyJobAlertsList() {
      if (dailyJobAlertsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dailyJobAlerts_);
      } else {
        return dailyJobAlertsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public int getDailyJobAlertsCount() {
      if (dailyJobAlertsBuilder_ == null) {
        return dailyJobAlerts_.size();
      } else {
        return dailyJobAlertsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public com.wanpng.emailalertapi.grpc.domain.DailyJobAlert getDailyJobAlerts(int index) {
      if (dailyJobAlertsBuilder_ == null) {
        return dailyJobAlerts_.get(index);
      } else {
        return dailyJobAlertsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder setDailyJobAlerts(
        int index, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert value) {
      if (dailyJobAlertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.set(index, value);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder setDailyJobAlerts(
        int index, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder builderForValue) {
      if (dailyJobAlertsBuilder_ == null) {
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.set(index, builderForValue.build());
        onChanged();
      } else {
        dailyJobAlertsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder addDailyJobAlerts(com.wanpng.emailalertapi.grpc.domain.DailyJobAlert value) {
      if (dailyJobAlertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.add(value);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder addDailyJobAlerts(
        int index, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert value) {
      if (dailyJobAlertsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.add(index, value);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder addDailyJobAlerts(
        com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder builderForValue) {
      if (dailyJobAlertsBuilder_ == null) {
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.add(builderForValue.build());
        onChanged();
      } else {
        dailyJobAlertsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder addDailyJobAlerts(
        int index, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder builderForValue) {
      if (dailyJobAlertsBuilder_ == null) {
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.add(index, builderForValue.build());
        onChanged();
      } else {
        dailyJobAlertsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder addAllDailyJobAlerts(
        java.lang.Iterable<? extends com.wanpng.emailalertapi.grpc.domain.DailyJobAlert> values) {
      if (dailyJobAlertsBuilder_ == null) {
        ensureDailyJobAlertsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dailyJobAlerts_);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder clearDailyJobAlerts() {
      if (dailyJobAlertsBuilder_ == null) {
        dailyJobAlerts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public Builder removeDailyJobAlerts(int index) {
      if (dailyJobAlertsBuilder_ == null) {
        ensureDailyJobAlertsIsMutable();
        dailyJobAlerts_.remove(index);
        onChanged();
      } else {
        dailyJobAlertsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder getDailyJobAlertsBuilder(
        int index) {
      return getDailyJobAlertsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder getDailyJobAlertsOrBuilder(
        int index) {
      if (dailyJobAlertsBuilder_ == null) {
        return dailyJobAlerts_.get(index);  } else {
        return dailyJobAlertsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public java.util.List<? extends com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder> 
         getDailyJobAlertsOrBuilderList() {
      if (dailyJobAlertsBuilder_ != null) {
        return dailyJobAlertsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dailyJobAlerts_);
      }
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder addDailyJobAlertsBuilder() {
      return getDailyJobAlertsFieldBuilder().addBuilder(
          com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder addDailyJobAlertsBuilder(
        int index) {
      return getDailyJobAlertsFieldBuilder().addBuilder(
          index, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.domain.DailyJobAlert daily_job_alerts = 2;</code>
     */
    public java.util.List<com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder> 
         getDailyJobAlertsBuilderList() {
      return getDailyJobAlertsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.emailalertapi.grpc.domain.DailyJobAlert, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder, com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder> 
        getDailyJobAlertsFieldBuilder() {
      if (dailyJobAlertsBuilder_ == null) {
        dailyJobAlertsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wanpng.emailalertapi.grpc.domain.DailyJobAlert, com.wanpng.emailalertapi.grpc.domain.DailyJobAlert.Builder, com.wanpng.emailalertapi.grpc.domain.DailyJobAlertOrBuilder>(
                dailyJobAlerts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dailyJobAlerts_ = null;
      }
      return dailyJobAlertsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protos.service.SendDailyJobAlertRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.service.SendDailyJobAlertRequest)
  private static final com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest();
  }

  public static com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendDailyJobAlertRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendDailyJobAlertRequest>() {
    @java.lang.Override
    public SendDailyJobAlertRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendDailyJobAlertRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendDailyJobAlertRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendDailyJobAlertRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.emailalertapi.grpc.service.SendDailyJobAlertRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

