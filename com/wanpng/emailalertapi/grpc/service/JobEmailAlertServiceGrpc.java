package com.wanpng.emailalertapi.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/job_email_alert_service.proto")
public final class JobEmailAlertServiceGrpc {

  private JobEmailAlertServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.JobEmailAlertService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInvitation,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendJobInvitation",
      requestType = com.wanpng.emailalertapi.grpc.domain.JobInvitation.class,
      responseType = com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInvitation,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInvitationMethod() {
    io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInvitation, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInvitationMethod;
    if ((getSendJobInvitationMethod = JobEmailAlertServiceGrpc.getSendJobInvitationMethod) == null) {
      synchronized (JobEmailAlertServiceGrpc.class) {
        if ((getSendJobInvitationMethod = JobEmailAlertServiceGrpc.getSendJobInvitationMethod) == null) {
          JobEmailAlertServiceGrpc.getSendJobInvitationMethod = getSendJobInvitationMethod =
              io.grpc.MethodDescriptor.<com.wanpng.emailalertapi.grpc.domain.JobInvitation, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendJobInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.domain.JobInvitation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobEmailAlertServiceMethodDescriptorSupplier("SendJobInvitation"))
              .build();
        }
      }
    }
    return getSendJobInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobApplicationStatusUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendJobApplicationStatusUpdate",
      requestType = com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest.class,
      responseType = com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobApplicationStatusUpdateMethod() {
    io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobApplicationStatusUpdateMethod;
    if ((getSendJobApplicationStatusUpdateMethod = JobEmailAlertServiceGrpc.getSendJobApplicationStatusUpdateMethod) == null) {
      synchronized (JobEmailAlertServiceGrpc.class) {
        if ((getSendJobApplicationStatusUpdateMethod = JobEmailAlertServiceGrpc.getSendJobApplicationStatusUpdateMethod) == null) {
          JobEmailAlertServiceGrpc.getSendJobApplicationStatusUpdateMethod = getSendJobApplicationStatusUpdateMethod =
              io.grpc.MethodDescriptor.<com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendJobApplicationStatusUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobEmailAlertServiceMethodDescriptorSupplier("SendJobApplicationStatusUpdate"))
              .build();
        }
      }
    }
    return getSendJobApplicationStatusUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInterviewRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendJobInterviewRequest",
      requestType = com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest.class,
      responseType = com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest,
      com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInterviewRequestMethod() {
    io.grpc.MethodDescriptor<com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> getSendJobInterviewRequestMethod;
    if ((getSendJobInterviewRequestMethod = JobEmailAlertServiceGrpc.getSendJobInterviewRequestMethod) == null) {
      synchronized (JobEmailAlertServiceGrpc.class) {
        if ((getSendJobInterviewRequestMethod = JobEmailAlertServiceGrpc.getSendJobInterviewRequestMethod) == null) {
          JobEmailAlertServiceGrpc.getSendJobInterviewRequestMethod = getSendJobInterviewRequestMethod =
              io.grpc.MethodDescriptor.<com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest, com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendJobInterviewRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobEmailAlertServiceMethodDescriptorSupplier("SendJobInterviewRequest"))
              .build();
        }
      }
    }
    return getSendJobInterviewRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobEmailAlertServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceStub>() {
        @java.lang.Override
        public JobEmailAlertServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobEmailAlertServiceStub(channel, callOptions);
        }
      };
    return JobEmailAlertServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobEmailAlertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceBlockingStub>() {
        @java.lang.Override
        public JobEmailAlertServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobEmailAlertServiceBlockingStub(channel, callOptions);
        }
      };
    return JobEmailAlertServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobEmailAlertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobEmailAlertServiceFutureStub>() {
        @java.lang.Override
        public JobEmailAlertServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobEmailAlertServiceFutureStub(channel, callOptions);
        }
      };
    return JobEmailAlertServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobEmailAlertServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendJobInvitation(com.wanpng.emailalertapi.grpc.domain.JobInvitation request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendJobInvitationMethod(), responseObserver);
    }

    /**
     */
    public void sendJobApplicationStatusUpdate(com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendJobApplicationStatusUpdateMethod(), responseObserver);
    }

    /**
     */
    public void sendJobInterviewRequest(com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendJobInterviewRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendJobInvitationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.emailalertapi.grpc.domain.JobInvitation,
                com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>(
                  this, METHODID_SEND_JOB_INVITATION)))
          .addMethod(
            getSendJobApplicationStatusUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest,
                com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>(
                  this, METHODID_SEND_JOB_APPLICATION_STATUS_UPDATE)))
          .addMethod(
            getSendJobInterviewRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest,
                com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>(
                  this, METHODID_SEND_JOB_INTERVIEW_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class JobEmailAlertServiceStub extends io.grpc.stub.AbstractAsyncStub<JobEmailAlertServiceStub> {
    private JobEmailAlertServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobEmailAlertServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobEmailAlertServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendJobInvitation(com.wanpng.emailalertapi.grpc.domain.JobInvitation request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendJobInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendJobApplicationStatusUpdate(com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendJobApplicationStatusUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendJobInterviewRequest(com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendJobInterviewRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobEmailAlertServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobEmailAlertServiceBlockingStub> {
    private JobEmailAlertServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobEmailAlertServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobEmailAlertServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse sendJobInvitation(com.wanpng.emailalertapi.grpc.domain.JobInvitation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendJobInvitationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse sendJobApplicationStatusUpdate(com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendJobApplicationStatusUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse sendJobInterviewRequest(com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendJobInterviewRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobEmailAlertServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobEmailAlertServiceFutureStub> {
    private JobEmailAlertServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobEmailAlertServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobEmailAlertServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> sendJobInvitation(
        com.wanpng.emailalertapi.grpc.domain.JobInvitation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendJobInvitationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> sendJobApplicationStatusUpdate(
        com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendJobApplicationStatusUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse> sendJobInterviewRequest(
        com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendJobInterviewRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_JOB_INVITATION = 0;
  private static final int METHODID_SEND_JOB_APPLICATION_STATUS_UPDATE = 1;
  private static final int METHODID_SEND_JOB_INTERVIEW_REQUEST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobEmailAlertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobEmailAlertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_JOB_INVITATION:
          serviceImpl.sendJobInvitation((com.wanpng.emailalertapi.grpc.domain.JobInvitation) request,
              (io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>) responseObserver);
          break;
        case METHODID_SEND_JOB_APPLICATION_STATUS_UPDATE:
          serviceImpl.sendJobApplicationStatusUpdate((com.wanpng.emailalertapi.grpc.service.SendJobApplicationStatusUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>) responseObserver);
          break;
        case METHODID_SEND_JOB_INTERVIEW_REQUEST:
          serviceImpl.sendJobInterviewRequest((com.wanpng.emailalertapi.grpc.domain.JobInterviewRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.emailalertapi.grpc.service.JobEmailAlertResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobEmailAlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobEmailAlertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.emailalertapi.grpc.service.JobEmailAlertServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobEmailAlertService");
    }
  }

  private static final class JobEmailAlertServiceFileDescriptorSupplier
      extends JobEmailAlertServiceBaseDescriptorSupplier {
    JobEmailAlertServiceFileDescriptorSupplier() {}
  }

  private static final class JobEmailAlertServiceMethodDescriptorSupplier
      extends JobEmailAlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobEmailAlertServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobEmailAlertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobEmailAlertServiceFileDescriptorSupplier())
              .addMethod(getSendJobInvitationMethod())
              .addMethod(getSendJobApplicationStatusUpdateMethod())
              .addMethod(getSendJobInterviewRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
