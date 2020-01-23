/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

public interface GerritSourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.GerritSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   *
   * @return The hostUri.
   */
  java.lang.String getHostUri();
  /**
   *
   *
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   *
   * @return The bytes for hostUri.
   */
  com.google.protobuf.ByteString getHostUriBytes();

  /**
   *
   *
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is the
   * hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   *
   * @return The gerritProject.
   */
  java.lang.String getGerritProject();
  /**
   *
   *
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is the
   * hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   *
   * @return The bytes for gerritProject.
   */
  com.google.protobuf.ByteString getGerritProjectBytes();

  /**
   *
   *
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   *
   * @return Whether the aliasContext field is set.
   */
  boolean hasAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   *
   * @return The aliasContext.
   */
  io.grafeas.v1beta1.source.AliasContext getAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
   */
  io.grafeas.v1beta1.source.AliasContextOrBuilder getAliasContextOrBuilder();

  public io.grafeas.v1beta1.source.GerritSourceContext.RevisionCase getRevisionCase();
}
