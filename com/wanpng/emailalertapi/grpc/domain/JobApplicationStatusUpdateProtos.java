// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/JobApplicationStatusUpdate.proto

package com.wanpng.emailalertapi.grpc.domain;

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
      "te.proto\022\rprotos.domain\"\362\001\n\032JobApplicati" +
      "onStatusUpdate\022\023\n\013employer_id\030\001 \001(\t\022\024\n\014c" +
      "ompany_name\030\002 \001(\t\022\020\n\010logoPath\030\003 \001(\t\022\016\n\006j" +
      "ob_id\030\004 \001(\t\022\021\n\tjob_title\030\005 \001(\t\022\016\n\006status" +
      "\030\006 \001(\t\022\020\n\010is_lanco\030\007 \001(\010\022\020\n\010province\030\010 \001" +
      "(\t\022\024\n\014career_level\030\t \001(\t\022\027\n\017employment_t" +
      "ype\030\n \001(\t\022\021\n\trecipient\030\013 \001(\tBz\n$com.wanp" +
      "ng.emailalertapi.grpc.domainB JobApplica" +
      "tionStatusUpdateProtosP\001Z.github.com/wan" +
      "png/email-alert-grpc/grpc/domainb\006proto3"
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
        new java.lang.String[] { "EmployerId", "CompanyName", "LogoPath", "JobId", "JobTitle", "Status", "IsLanco", "Province", "CareerLevel", "EmploymentType", "Recipient", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
