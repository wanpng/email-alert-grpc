// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.17.3
// source: protos/domain/EmailAlertJob.proto

package domain

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type EmailAlertJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	JobTitle       string `protobuf:"bytes,1,opt,name=job_title,json=jobTitle,proto3" json:"job_title,omitempty"`
	CompanyName    string `protobuf:"bytes,2,opt,name=company_name,json=companyName,proto3" json:"company_name,omitempty"`
	CompanyLogo    string `protobuf:"bytes,3,opt,name=company_logo,json=companyLogo,proto3" json:"company_logo,omitempty"`
	IsLanco        bool   `protobuf:"varint,4,opt,name=is_lanco,json=isLanco,proto3" json:"is_lanco,omitempty"`
	Province       string `protobuf:"bytes,5,opt,name=province,proto3" json:"province,omitempty"`
	CareerLevel    string `protobuf:"bytes,6,opt,name=career_level,json=careerLevel,proto3" json:"career_level,omitempty"`
	EmploymentType string `protobuf:"bytes,7,opt,name=employment_type,json=employmentType,proto3" json:"employment_type,omitempty"`
	Url            string `protobuf:"bytes,8,opt,name=url,proto3" json:"url,omitempty"`
}

func (x *EmailAlertJob) Reset() {
	*x = EmailAlertJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_EmailAlertJob_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EmailAlertJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EmailAlertJob) ProtoMessage() {}

func (x *EmailAlertJob) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_EmailAlertJob_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EmailAlertJob.ProtoReflect.Descriptor instead.
func (*EmailAlertJob) Descriptor() ([]byte, []int) {
	return file_protos_domain_EmailAlertJob_proto_rawDescGZIP(), []int{0}
}

func (x *EmailAlertJob) GetJobTitle() string {
	if x != nil {
		return x.JobTitle
	}
	return ""
}

func (x *EmailAlertJob) GetCompanyName() string {
	if x != nil {
		return x.CompanyName
	}
	return ""
}

func (x *EmailAlertJob) GetCompanyLogo() string {
	if x != nil {
		return x.CompanyLogo
	}
	return ""
}

func (x *EmailAlertJob) GetIsLanco() bool {
	if x != nil {
		return x.IsLanco
	}
	return false
}

func (x *EmailAlertJob) GetProvince() string {
	if x != nil {
		return x.Province
	}
	return ""
}

func (x *EmailAlertJob) GetCareerLevel() string {
	if x != nil {
		return x.CareerLevel
	}
	return ""
}

func (x *EmailAlertJob) GetEmploymentType() string {
	if x != nil {
		return x.EmploymentType
	}
	return ""
}

func (x *EmailAlertJob) GetUrl() string {
	if x != nil {
		return x.Url
	}
	return ""
}

var File_protos_domain_EmailAlertJob_proto protoreflect.FileDescriptor

var file_protos_domain_EmailAlertJob_proto_rawDesc = []byte{
	0x0a, 0x21, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x45, 0x6d, 0x61, 0x69, 0x6c, 0x41, 0x6c, 0x65, 0x72, 0x74, 0x4a, 0x6f, 0x62, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61,
	0x69, 0x6e, 0x22, 0x87, 0x02, 0x0a, 0x0d, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x41, 0x6c, 0x65, 0x72,
	0x74, 0x4a, 0x6f, 0x62, 0x12, 0x1b, 0x0a, 0x09, 0x6a, 0x6f, 0x62, 0x5f, 0x74, 0x69, 0x74, 0x6c,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6a, 0x6f, 0x62, 0x54, 0x69, 0x74, 0x6c,
	0x65, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f,
	0x6c, 0x6f, 0x67, 0x6f, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x6f, 0x6d, 0x70,
	0x61, 0x6e, 0x79, 0x4c, 0x6f, 0x67, 0x6f, 0x12, 0x19, 0x0a, 0x08, 0x69, 0x73, 0x5f, 0x6c, 0x61,
	0x6e, 0x63, 0x6f, 0x18, 0x04, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x69, 0x73, 0x4c, 0x61, 0x6e,
	0x63, 0x6f, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x6e, 0x63, 0x65, 0x12, 0x21,
	0x0a, 0x0c, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x5f, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x18, 0x06,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x61, 0x72, 0x65, 0x65, 0x72, 0x4c, 0x65, 0x76, 0x65,
	0x6c, 0x12, 0x27, 0x0a, 0x0f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f,
	0x74, 0x79, 0x70, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x65, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x10, 0x0a, 0x03, 0x75, 0x72,
	0x6c, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x75, 0x72, 0x6c, 0x42, 0x6d, 0x0a, 0x24,
	0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e, 0x65, 0x6d, 0x61, 0x69, 0x6c,
	0x61, 0x6c, 0x65, 0x72, 0x74, 0x61, 0x70, 0x69, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x64, 0x6f,
	0x6d, 0x61, 0x69, 0x6e, 0x42, 0x13, 0x45, 0x6d, 0x61, 0x69, 0x6c, 0x41, 0x6c, 0x65, 0x72, 0x74,
	0x4a, 0x6f, 0x62, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x50, 0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x65,
	0x6d, 0x61, 0x69, 0x6c, 0x2d, 0x61, 0x6c, 0x65, 0x72, 0x74, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f,
	0x67, 0x72, 0x70, 0x63, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_EmailAlertJob_proto_rawDescOnce sync.Once
	file_protos_domain_EmailAlertJob_proto_rawDescData = file_protos_domain_EmailAlertJob_proto_rawDesc
)

func file_protos_domain_EmailAlertJob_proto_rawDescGZIP() []byte {
	file_protos_domain_EmailAlertJob_proto_rawDescOnce.Do(func() {
		file_protos_domain_EmailAlertJob_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_EmailAlertJob_proto_rawDescData)
	})
	return file_protos_domain_EmailAlertJob_proto_rawDescData
}

var file_protos_domain_EmailAlertJob_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_EmailAlertJob_proto_goTypes = []interface{}{
	(*EmailAlertJob)(nil), // 0: protos.domain.EmailAlertJob
}
var file_protos_domain_EmailAlertJob_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_domain_EmailAlertJob_proto_init() }
func file_protos_domain_EmailAlertJob_proto_init() {
	if File_protos_domain_EmailAlertJob_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_EmailAlertJob_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EmailAlertJob); i {
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
			RawDescriptor: file_protos_domain_EmailAlertJob_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_EmailAlertJob_proto_goTypes,
		DependencyIndexes: file_protos_domain_EmailAlertJob_proto_depIdxs,
		MessageInfos:      file_protos_domain_EmailAlertJob_proto_msgTypes,
	}.Build()
	File_protos_domain_EmailAlertJob_proto = out.File
	file_protos_domain_EmailAlertJob_proto_rawDesc = nil
	file_protos_domain_EmailAlertJob_proto_goTypes = nil
	file_protos_domain_EmailAlertJob_proto_depIdxs = nil
}
