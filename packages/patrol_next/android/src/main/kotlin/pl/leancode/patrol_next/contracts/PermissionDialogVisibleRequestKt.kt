//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.patrol_next.contracts;

@kotlin.jvm.JvmName("-initializepermissionDialogVisibleRequest")
inline fun permissionDialogVisibleRequest(block: pl.leancode.patrol_next.contracts.PermissionDialogVisibleRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest =
  pl.leancode.patrol_next.contracts.PermissionDialogVisibleRequestKt.Dsl._create(pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest.newBuilder()).apply { block() }._build()
object PermissionDialogVisibleRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest = _builder.build()

    /**
     * <code>uint64 timeoutMillis = 1;</code>
     */
    var timeoutMillis: kotlin.Long
      @JvmName("getTimeoutMillis")
      get() = _builder.getTimeoutMillis()
      @JvmName("setTimeoutMillis")
      set(value) {
        _builder.setTimeoutMillis(value)
      }
    /**
     * <code>uint64 timeoutMillis = 1;</code>
     */
    fun clearTimeoutMillis() {
      _builder.clearTimeoutMillis()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest.copy(block: pl.leancode.patrol_next.contracts.PermissionDialogVisibleRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol_next.contracts.Contracts.PermissionDialogVisibleRequest =
  pl.leancode.patrol_next.contracts.PermissionDialogVisibleRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
