// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_email_alert_service.proto

package com.wanpng.emailalert.grpc.service;

public final class JobEmailAlertServiceProtos {
  private JobEmailAlertServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_JobEmailAlertResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_JobEmailAlertResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,protos/service/job_email_alert_service" +
      ".proto\022\016protos.service\032!protos/domain/Jo" +
      "bInvitation.proto\032.protos/domain/JobAppl" +
      "icationStatusUpdate.proto\032\'protos/domain" +
      "/JobInterviewRequest.proto\":\n\025JobEmailAl" +
      "ertResponse\022\021\n\tstatus_id\030\001 \001(\005\022\016\n\006status" +
      "\030\002 \001(\t2\312\002\n\024JobEmailAlertService\022X\n\021SendJ" +
      "obInvitation\022\034.protos.domain.JobInvitati" +
      "on\032%.protos.service.JobEmailAlertRespons" +
      "e\022r\n\036SendJobApplicationStatusUpdate\022).pr" +
      "otos.domain.JobApplicationStatusUpdate\032%" +
      ".protos.service.JobEmailAlertResponse\022d\n" +
      "\027SendJobInterviewRequest\022\".protos.domain" +
      ".JobInterviewRequest\032%.protos.service.Jo" +
      "bEmailAlertResponseBs\n\"com.wanpng.emaila" +
      "lert.grpc.serviceB\032JobEmailAlertServiceP" +
      "rotosP\001Z/github.com/wanpng/email-alert-g" +
      "rpc/grpc/serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanpng.emailalert.grpc.domain.JobInvitationProtos.getDescriptor(),
          com.wanpng.emailalert.grpc.domain.JobApplicationStatusUpdateProtos.getDescriptor(),
          com.wanpng.emailalert.grpc.domain.JobInterviewRequestProtos.getDescriptor(),
        });
    internal_static_protos_service_JobEmailAlertResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_service_JobEmailAlertResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_JobEmailAlertResponse_descriptor,
        new java.lang.String[] { "StatusId", "Status", });
    com.wanpng.emailalert.grpc.domain.JobInvitationProtos.getDescriptor();
    com.wanpng.emailalert.grpc.domain.JobApplicationStatusUpdateProtos.getDescriptor();
    com.wanpng.emailalert.grpc.domain.JobInterviewRequestProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
