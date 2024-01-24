/*
 * Copyright 2024 Google LLC
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
// source: google/spanner/executor/v1/cloud_executor.proto

package com.google.spanner.executor.v1;

public interface StartTransactionActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.executor.v1.StartTransactionAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Concurrency is for read-only transactions and must be omitted for
   * read-write transactions.
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.Concurrency concurrency = 1;</code>
   *
   * @return Whether the concurrency field is set.
   */
  boolean hasConcurrency();
  /**
   *
   *
   * <pre>
   * Concurrency is for read-only transactions and must be omitted for
   * read-write transactions.
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.Concurrency concurrency = 1;</code>
   *
   * @return The concurrency.
   */
  com.google.spanner.executor.v1.Concurrency getConcurrency();
  /**
   *
   *
   * <pre>
   * Concurrency is for read-only transactions and must be omitted for
   * read-write transactions.
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.Concurrency concurrency = 1;</code>
   */
  com.google.spanner.executor.v1.ConcurrencyOrBuilder getConcurrencyOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about tables and columns that will be involved in this
   * transaction. It is to convert values of key parts correctly.
   * </pre>
   *
   * <code>repeated .google.spanner.executor.v1.TableMetadata table = 2;</code>
   */
  java.util.List<com.google.spanner.executor.v1.TableMetadata> getTableList();
  /**
   *
   *
   * <pre>
   * Metadata about tables and columns that will be involved in this
   * transaction. It is to convert values of key parts correctly.
   * </pre>
   *
   * <code>repeated .google.spanner.executor.v1.TableMetadata table = 2;</code>
   */
  com.google.spanner.executor.v1.TableMetadata getTable(int index);
  /**
   *
   *
   * <pre>
   * Metadata about tables and columns that will be involved in this
   * transaction. It is to convert values of key parts correctly.
   * </pre>
   *
   * <code>repeated .google.spanner.executor.v1.TableMetadata table = 2;</code>
   */
  int getTableCount();
  /**
   *
   *
   * <pre>
   * Metadata about tables and columns that will be involved in this
   * transaction. It is to convert values of key parts correctly.
   * </pre>
   *
   * <code>repeated .google.spanner.executor.v1.TableMetadata table = 2;</code>
   */
  java.util.List<? extends com.google.spanner.executor.v1.TableMetadataOrBuilder>
      getTableOrBuilderList();
  /**
   *
   *
   * <pre>
   * Metadata about tables and columns that will be involved in this
   * transaction. It is to convert values of key parts correctly.
   * </pre>
   *
   * <code>repeated .google.spanner.executor.v1.TableMetadata table = 2;</code>
   */
  com.google.spanner.executor.v1.TableMetadataOrBuilder getTableOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Transaction_seed contains workid and op pair for this transaction, used for
   * testing.
   * </pre>
   *
   * <code>string transaction_seed = 3;</code>
   *
   * @return The transactionSeed.
   */
  java.lang.String getTransactionSeed();
  /**
   *
   *
   * <pre>
   * Transaction_seed contains workid and op pair for this transaction, used for
   * testing.
   * </pre>
   *
   * <code>string transaction_seed = 3;</code>
   *
   * @return The bytes for transactionSeed.
   */
  com.google.protobuf.ByteString getTransactionSeedBytes();

  /**
   *
   *
   * <pre>
   * Execution options (e.g., whether transaction is opaque, optimistic).
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.TransactionExecutionOptions execution_options = 4;
   * </code>
   *
   * @return Whether the executionOptions field is set.
   */
  boolean hasExecutionOptions();
  /**
   *
   *
   * <pre>
   * Execution options (e.g., whether transaction is opaque, optimistic).
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.TransactionExecutionOptions execution_options = 4;
   * </code>
   *
   * @return The executionOptions.
   */
  com.google.spanner.executor.v1.TransactionExecutionOptions getExecutionOptions();
  /**
   *
   *
   * <pre>
   * Execution options (e.g., whether transaction is opaque, optimistic).
   * </pre>
   *
   * <code>optional .google.spanner.executor.v1.TransactionExecutionOptions execution_options = 4;
   * </code>
   */
  com.google.spanner.executor.v1.TransactionExecutionOptionsOrBuilder
      getExecutionOptionsOrBuilder();
}
