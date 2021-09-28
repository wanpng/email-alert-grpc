// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.17.3
// source: protos/domain/JobInterviewRequest.proto

package domain

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type JobInterviewRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EmployerId        string                 `protobuf:"bytes,1,opt,name=employer_id,json=employerId,proto3" json:"employer_id,omitempty"`
	EmployerFirstName string                 `protobuf:"bytes,2,opt,name=employer_first_name,json=employerFirstName,proto3" json:"employer_first_name,omitempty"`
	EmployerLastName  string                 `protobuf:"bytes,3,opt,name=employer_last_name,json=employerLastName,proto3" json:"employer_last_name,omitempty"`
	EmployerName      string                 `protobuf:"bytes,4,opt,name=employer_name,json=employerName,proto3" json:"employer_name,omitempty"`
	InterviewDate     *timestamppb.Timestamp `protobuf:"bytes,5,opt,name=interviewDate,proto3" json:"interviewDate,omitempty"`
	InterviewStart    string                 `protobuf:"bytes,6,opt,name=interviewStart,proto3" json:"interviewStart,omitempty"`
	InterviewEnd      string                 `protobuf:"bytes,7,opt,name=interviewEnd,proto3" json:"interviewEnd,omitempty"`
	JobId             string                 `protobuf:"bytes,8,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	JobTitle          string                 `protobuf:"bytes,9,opt,name=job_title,json=jobTitle,proto3" json:"job_title,omitempty"`
	IsLanco           bool                   `protobuf:"varint,10,opt,name=is_lanco,json=isLanco,proto3" json:"is_lanco,omitempty"`
	Province          string                 `protobuf:"bytes,11,opt,name=province,proto3" json:"province,omitempty"`
	CareerLevel       string                 `protobuf:"bytes,12,opt,name=career_level,json=careerLevel,proto3" json:"career_level,omitempty"`
	EmploymentType    string                 `protobuf:"bytes,13,opt,name=employment_type,json=employmentType,proto3" json:"employment_type,omitempty"`
	Recipient         string                 `protobuf:"bytes,14,opt,name=recipient,proto3" json:"recipient,omitempty"`
}

func (x *JobInterviewRequest) Reset() {
	*x = JobInterviewRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_JobInterviewRequest_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobInterviewRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobInterviewRequest) ProtoMessage() {}

func (x *JobInterviewRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_JobInterviewRequest_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobInterviewRequest.ProtoReflect.Descriptor instead.
func (*JobInterviewRequest) Descriptor() ([]byte, []int) {
	return file_protos_domain_JobInterviewRequest_proto_rawDescGZIP(), []int{0}
}

func (x *JobInterviewRequest) GetEmployerId() string {
	if x != nil {
		return x.EmployerId
	}
	return ""
}

func (x *JobInterviewRequest) GetEmployerFirstName() string {
	if x != nil {
		return x.EmployerFirstName
	}
	return ""
}

func (x *JobInterviewRequest) GetEmployerLastName() string {
	if x != nil {
		return x.EmployerLastName
	}
	return ""
}

func (x *JobInterviewRequest) GetEmployerName() string {
	if x != nil {
		return x.EmployerName
	}
	return ""
}

func (x *JobInterviewRequest) GetInterviewDate() *timestamppb.Timestamp {
	if x != nil {
		return x.InterviewDate
	}
	return nil
}

func (x *JobInterviewRequest) GetInterviewStart() string {
	if x != nil {
		return x.InterviewStart
	}
	return ""
}

func (x *JobInterviewRequest) GetInterviewEnd() string {
	if x != nil {
		return x.InterviewEnd
	}
	return ""
}

func (x *JobInterviewRequest) GetJobId() string {
	if x != nil {
		return x.JobId
	}
	return ""
}

func (x *JobInterviewRequest) GetJobTitle() string {
	if x != nil {
		return x.JobTitle
	}
	return ""
}

func (x *JobInterviewRequest) GetIsLanco() bool {
	if x != nil {
		return x.IsLanco
	}
	return false
}

func (x *JobInterviewRequest) GetProvince() string {
	if x != nil {
		return x.Province
	}
	return ""
}

func (x *JobInterviewRequest) GetCareerLevel() string {
	if x != nil {
		return x.CareerLevel
	}
	return ""
}

func (x *JobInterviewRequest) GetEmploymentType() string {
	if x != nil {
		return x.EmploymentType
	}
	return ""
}

func (x *JobInterviewRequest) GetRecipient() string {
	if x != nil {
		return x.Recipient
	}
	return ""
}

var File_protos_domain_JobInterviewRequest_proto protoreflect.FileDescriptor

var file_protos_domain_JobInterviewRequest_proto_rawDesc = []byte{
	0x0a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74,
	0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9c, 0x04, 0x0a, 0x13, 0x4a, 0x6f,
	0x62, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x1f, 0x0a, 0x0b, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x49, 0x64, 0x12, 0x2e, 0x0a, 0x13, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x66,
	0x69, 0x72, 0x73, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x11, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x46, 0x69, 0x72, 0x73, 0x74, 0x4e, 0x61,
	0x6d, 0x65, 0x12, 0x2c, 0x0a, 0x12, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x6c,
	0x61, 0x73, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10,
	0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x4c, 0x61, 0x73, 0x74, 0x4e, 0x61, 0x6d, 0x65,
	0x12, 0x23, 0x0a, 0x0d, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65,
	0x72, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x40, 0x0a, 0x0d, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69,
	0x65, 0x77, 0x44, 0x61, 0x74, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54,
	0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x0d, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76,
	0x69, 0x65, 0x77, 0x44, 0x61, 0x74, 0x65, 0x12, 0x26, 0x0a, 0x0e, 0x69, 0x6e, 0x74, 0x65, 0x72,
	0x76, 0x69, 0x65, 0x77, 0x53, 0x74, 0x61, 0x72, 0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x53, 0x74, 0x61, 0x72, 0x74, 0x12,
	0x22, 0x0a, 0x0c, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x45, 0x6e, 0x64, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77,
	0x45, 0x6e, 0x64, 0x12, 0x15, 0x0a, 0x06, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x05, 0x6a, 0x6f, 0x62, 0x49, 0x64, 0x12, 0x1b, 0x0a, 0x09, 0x6a, 0x6f,
	0x62, 0x5f, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6a,
	0x6f, 0x62, 0x54, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x19, 0x0a, 0x08, 0x69, 0x73, 0x5f, 0x6c, 0x61,
	0x6e, 0x63, 0x6f, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x69, 0x73, 0x4c, 0x61, 0x6e,
	0x63, 0x6f, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x18, 0x0b,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x12, 0x21,
	0x0a, 0x0c, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x5f, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x18, 0x0c,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x4c, 0x65, 0x76, 0x65,
	0x6c, 0x12, 0x27, 0x0a, 0x0f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x65, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x72, 0x65,
	0x63, 0x69, 0x70, 0x69, 0x65, 0x6e, 0x74, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x72,
	0x65, 0x63, 0x69, 0x70, 0x69, 0x65, 0x6e, 0x74, 0x42, 0x70, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e,
	0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x61, 0x6c, 0x65, 0x72,
	0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x42, 0x19, 0x4a,
	0x6f, 0x62, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x50, 0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x65, 0x6d,
	0x61, 0x69, 0x6c, 0x2d, 0x61, 0x6c, 0x65, 0x72, 0x74, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67,
	0x72, 0x70, 0x63, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_protos_domain_JobInterviewRequest_proto_rawDescOnce sync.Once
	file_protos_domain_JobInterviewRequest_proto_rawDescData = file_protos_domain_JobInterviewRequest_proto_rawDesc
)

func file_protos_domain_JobInterviewRequest_proto_rawDescGZIP() []byte {
	file_protos_domain_JobInterviewRequest_proto_rawDescOnce.Do(func() {
		file_protos_domain_JobInterviewRequest_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_JobInterviewRequest_proto_rawDescData)
	})
	return file_protos_domain_JobInterviewRequest_proto_rawDescData
}

var file_protos_domain_JobInterviewRequest_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_JobInterviewRequest_proto_goTypes = []interface{}{
	(*JobInterviewRequest)(nil),   // 0: protos.domain.JobInterviewRequest
	(*timestamppb.Timestamp)(nil), // 1: google.protobuf.Timestamp
}
var file_protos_domain_JobInterviewRequest_proto_depIdxs = []int32{
	1, // 0: protos.domain.JobInterviewRequest.interviewDate:type_name -> google.protobuf.Timestamp
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_protos_domain_JobInterviewRequest_proto_init() }
func file_protos_domain_JobInterviewRequest_proto_init() {
	if File_protos_domain_JobInterviewRequest_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_JobInterviewRequest_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobInterviewRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_domain_JobInterviewRequest_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_JobInterviewRequest_proto_goTypes,
		DependencyIndexes: file_protos_domain_JobInterviewRequest_proto_depIdxs,
		MessageInfos:      file_protos_domain_JobInterviewRequest_proto_msgTypes,
	}.Build()
	File_protos_domain_JobInterviewRequest_proto = out.File
	file_protos_domain_JobInterviewRequest_proto_rawDesc = nil
	file_protos_domain_JobInterviewRequest_proto_goTypes = nil
	file_protos_domain_JobInterviewRequest_proto_depIdxs = nil
}
