// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface MemberAddResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberAddResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   */
  boolean hasMember();
  /**
   * <pre>
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   */
  Member getMember();
  /**
   * <pre>
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   */
  MemberOrBuilder getMemberOrBuilder();

  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  java.util.List<Member>
      getMembersList();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  Member getMembers(int index);
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  java.util.List<? extends MemberOrBuilder>
      getMembersOrBuilderList();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  MemberOrBuilder getMembersOrBuilder(
          int index);
}