// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/JobApplicationStatusUpdate.proto

package com.wanpng.emailalert.grpc.domain;

public final class JobApplicationStatusUpdateProtos {
  private JobApplicationStatusUpdateProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_JobApplicationStatusUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_JobApplicationStatusUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.protos/domain/JobApplicationStatusUpda" +
      "te.proto\022\rprotos.domain\"\341\001\n\032JobApplicati" +
      "onStatusUpdate\022\023\n\013employer_id\030\001 \001(\t\022\025\n\re" +
      "mployer_name\030\002 \001(\t\022\016\n\006job_id\030\003 \001(\t\022\021\n\tjo" +
      "b_title\030\004 \001(\t\022\016\n\006status\030\005 \001(\t\022\020\n\010is_lanc" +
      "o\030\006 \001(\010\022\020\n\010province\030\007 \001(\t\022\024\n\014career_leve" +
      "l\030\010 \001(\t\022\027\n\017employment_type\030\t \001(\t\022\021\n\treci" +
      "pient\030\n \001(\tBw\n!com.wanpng.emailalert.grp" +
      "c.domainB JobApplicationStatusUpdateProt" +
      "osP\001Z.github.com/wanpng/email-alert-grpc" +
      "/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_JobApplicationStatusUpdate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_JobApplicationStatusUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_JobApplicationStatusUpdate_descriptor,
        new java.lang.String[] { "EmployerId", "EmployerName", "JobId", "JobTitle", "Status", "IsLanco", "Province", "CareerLevel", "EmploymentType", "Recipient", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
