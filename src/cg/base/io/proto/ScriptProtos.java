// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Script.proto

package cg.base.io.proto;

public final class ScriptProtos {
  private ScriptProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface REQUEST_SCRIPT_MUTUALOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 dir = 1;
    boolean hasDir();
    int getDir();
    
    // required int32 op = 2;
    boolean hasOp();
    int getOp();
  }
  public static final class REQUEST_SCRIPT_MUTUAL extends
      com.google.protobuf.GeneratedMessage
      implements REQUEST_SCRIPT_MUTUALOrBuilder {
    // Use REQUEST_SCRIPT_MUTUAL.newBuilder() to construct.
    private REQUEST_SCRIPT_MUTUAL(Builder builder) {
      super(builder);
    }
    private REQUEST_SCRIPT_MUTUAL(boolean noInit) {}
    
    private static final REQUEST_SCRIPT_MUTUAL defaultInstance;
    public static REQUEST_SCRIPT_MUTUAL getDefaultInstance() {
      return defaultInstance;
    }
    
    public REQUEST_SCRIPT_MUTUAL getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cg.base.io.proto.ScriptProtos.internal_static_REQUEST_SCRIPT_MUTUAL_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cg.base.io.proto.ScriptProtos.internal_static_REQUEST_SCRIPT_MUTUAL_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 dir = 1;
    public static final int DIR_FIELD_NUMBER = 1;
    private int dir_;
    public boolean hasDir() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getDir() {
      return dir_;
    }
    
    // required int32 op = 2;
    public static final int OP_FIELD_NUMBER = 2;
    private int op_;
    public boolean hasOp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOp() {
      return op_;
    }
    
    private void initFields() {
      dir_ = 0;
      op_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasDir()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, dir_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, op_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, dir_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, op_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUALOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cg.base.io.proto.ScriptProtos.internal_static_REQUEST_SCRIPT_MUTUAL_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cg.base.io.proto.ScriptProtos.internal_static_REQUEST_SCRIPT_MUTUAL_fieldAccessorTable;
      }
      
      // Construct using cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        dir_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.getDescriptor();
      }
      
      public cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL getDefaultInstanceForType() {
        return cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.getDefaultInstance();
      }
      
      public cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL build() {
        cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL buildPartial() {
        cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL result = new cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dir_ = dir_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.op_ = op_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL) {
          return mergeFrom((cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL other) {
        if (other == cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.getDefaultInstance()) return this;
        if (other.hasDir()) {
          setDir(other.getDir());
        }
        if (other.hasOp()) {
          setOp(other.getOp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasDir()) {
          
          return false;
        }
        if (!hasOp()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              dir_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              op_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 dir = 1;
      private int dir_ ;
      public boolean hasDir() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getDir() {
        return dir_;
      }
      public Builder setDir(int value) {
        bitField0_ |= 0x00000001;
        dir_ = value;
        onChanged();
        return this;
      }
      public Builder clearDir() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dir_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 op = 2;
      private int op_ ;
      public boolean hasOp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOp() {
        return op_;
      }
      public Builder setOp(int value) {
        bitField0_ |= 0x00000002;
        op_ = value;
        onChanged();
        return this;
      }
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        op_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:REQUEST_SCRIPT_MUTUAL)
    }
    
    static {
      defaultInstance = new REQUEST_SCRIPT_MUTUAL(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:REQUEST_SCRIPT_MUTUAL)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_REQUEST_SCRIPT_MUTUAL_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_REQUEST_SCRIPT_MUTUAL_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Script.proto\"0\n\025REQUEST_SCRIPT_MUTUAL\022" +
      "\013\n\003dir\030\001 \002(\005\022\n\n\002op\030\002 \002(\005B \n\020cg.base.io.p" +
      "rotoB\014ScriptProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_REQUEST_SCRIPT_MUTUAL_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_REQUEST_SCRIPT_MUTUAL_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_REQUEST_SCRIPT_MUTUAL_descriptor,
              new java.lang.String[] { "Dir", "Op", },
              cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.class,
              cg.base.io.proto.ScriptProtos.REQUEST_SCRIPT_MUTUAL.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
