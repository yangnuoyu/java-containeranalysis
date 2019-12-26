/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/containeranalysis/v1beta1/common/common.proto

package io.grafeas.v1beta1.common;

public interface SignatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.Signature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The content of the signature, an opaque bytestring.
   * The payload that this signature verifies MUST be unambiguously provided
   * with the Signature during verification. A wrapper message might provide
   * the payload explicitly. Alternatively, a message might have a canonical
   * serialization that can always be unambiguously computed to derive the
   * payload.
   * </pre>
   *
   * <code>bytes signature = 1;</code>
   *
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   *
   *
   * <pre>
   * The identifier for the public key that verifies this signature.
   *   * The `public_key_id` is required.
   *   * The `public_key_id` MUST be an RFC3986 conformant URI.
   *   * When possible, the `public_key_id` SHOULD be an immutable reference,
   *     such as a cryptographic digest.
   * Examples of valid `public_key_id`s:
   * OpenPGP V4 public key fingerprint:
   *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
   * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
   * details on this scheme.
   * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
   * serialization):
   *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
   *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
   * </pre>
   *
   * <code>string public_key_id = 2;</code>
   *
   * @return The publicKeyId.
   */
  java.lang.String getPublicKeyId();
  /**
   *
   *
   * <pre>
   * The identifier for the public key that verifies this signature.
   *   * The `public_key_id` is required.
   *   * The `public_key_id` MUST be an RFC3986 conformant URI.
   *   * When possible, the `public_key_id` SHOULD be an immutable reference,
   *     such as a cryptographic digest.
   * Examples of valid `public_key_id`s:
   * OpenPGP V4 public key fingerprint:
   *   * "openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA"
   * See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
   * details on this scheme.
   * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER
   * serialization):
   *   * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
   *   * "nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5"
   * </pre>
   *
   * <code>string public_key_id = 2;</code>
   *
   * @return The bytes for publicKeyId.
   */
  com.google.protobuf.ByteString getPublicKeyIdBytes();
}