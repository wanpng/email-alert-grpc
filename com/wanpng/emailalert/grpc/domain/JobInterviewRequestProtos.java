// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/JobInterviewRequest.proto

package com.wanpng.emailalert.grpc.domain;

public final class JobInterviewRequestProtos {
  private JobInterviewRequestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_JobInterviewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_JobInterviewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'protos/domain/JobInterviewRequest.prot" +
      "o\022\rprotos.domain\032\037google/protobuf/timest" +
      "amp.proto\"\344\002\n\023JobInterviewRequest\022\023\n\013emp" +
      "loyer_id\030\001 \001(\t\022\033\n\023employer_first_name\030\002 " +
      "\001(\t\022\032\n\022employer_last_name\030\003 \001(\t\022\025\n\remplo" +
      "yer_name\030\004 \001(\t\0221\n\rinterviewDate\030\005 \001(\0132\032." +
      "google.protobuf.Timestamp\022\026\n\016interviewSt" +
      "art\030\006 \001(\t\022\024\n\014interviewEnd\030\007 \001(\t\022\016\n\006job_i" +
      "d\030\010 \001(\t\022\021\n\tjob_title\030\t \001(\t\022\020\n\010is_lanco\030\n" +
      " \001(\010\022\020\n\010province\030\013 \001(\t\022\024\n\014career_level\030\014" +
      " \001(\t\022\027\n\017employment_type\030\r \001(\t\022\021\n\trecipie" +
      "nt\030\016 \001(\tBp\n!com.wanpng.emailalert.grpc.d" +
      "omainB\031JobInterviewRequestProtosP\001Z.gith" +
      "ub.com/wanpng/email-alert-grpc/grpc/doma" +
      "inb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_protos_domain_JobInterviewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_JobInterviewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_JobInterviewRequest_descriptor,
        new java.lang.String[] { "EmployerId", "EmployerFirstName", "EmployerLastName", "EmployerName", "InterviewDate", "InterviewStart", "InterviewEnd", "JobId", "JobTitle", "IsLanco", "Province", "CareerLevel", "EmploymentType", "Recipient", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}