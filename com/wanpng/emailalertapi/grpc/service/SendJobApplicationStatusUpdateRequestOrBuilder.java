// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_email_alert_service.proto

package com.wanpng.emailalertapi.grpc.service;

public interface SendJobApplicationStatusUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.service.SendJobApplicationStatusUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protos.domain.JobApplicationStatusUpdate jobApplicationStatusUpdates = 1;</code>
   */
  java.util.List<com.wanpng.emailalertapi.grpc.domain.JobApplicationStatusUpdate> 
      getJobApplicationStatusUpdatesList();
  /**
   * <code>repeated .protos.domain.JobApplicationStatusUpdate jobApplicationStatusUpdates = 1;</code>
   */
  com.wanpng.emailalertapi.grpc.domain.JobApplicationStatusUpdate getJobApplicationStatusUpdates(int index);
  /**
   * <code>repeated .protos.domain.JobApplicationStatusUpdate jobApplicationStatusUpdates = 1;</code>
   */
  int getJobApplicationStatusUpdatesCount();
  /**
   * <code>repeated .protos.domain.JobApplicationStatusUpdate jobApplicationStatusUpdates = 1;</code>
   */
  java.util.List<? extends com.wanpng.emailalertapi.grpc.domain.JobApplicationStatusUpdateOrBuilder> 
      getJobApplicationStatusUpdatesOrBuilderList();
  /**
   * <code>repeated .protos.domain.JobApplicationStatusUpdate jobApplicationStatusUpdates = 1;</code>
   */
  com.wanpng.emailalertapi.grpc.domain.JobApplicationStatusUpdateOrBuilder getJobApplicationStatusUpdatesOrBuilder(
      int index);
}
