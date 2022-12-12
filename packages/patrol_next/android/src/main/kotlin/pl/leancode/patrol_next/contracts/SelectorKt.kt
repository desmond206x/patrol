//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.patrol_next.contracts;

@kotlin.jvm.JvmName("-initializeselector")
inline fun selector(block: pl.leancode.patrol_next.contracts.SelectorKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol_next.contracts.Contracts.Selector =
  pl.leancode.patrol_next.contracts.SelectorKt.Dsl._create(pl.leancode.patrol_next.contracts.Contracts.Selector.newBuilder()).apply { block() }._build()
object SelectorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.patrol_next.contracts.Contracts.Selector.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol_next.contracts.Contracts.Selector.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol_next.contracts.Contracts.Selector = _builder.build()

    /**
     * <code>optional string text = 1;</code>
     */
    var text: kotlin.String
      @JvmName("getText")
      get() = _builder.getText()
      @JvmName("setText")
      set(value) {
        _builder.setText(value)
      }
    /**
     * <code>optional string text = 1;</code>
     */
    fun clearText() {
      _builder.clearText()
    }
    /**
     * <code>optional string text = 1;</code>
     * @return Whether the text field is set.
     */
    fun hasText(): kotlin.Boolean {
      return _builder.hasText()
    }

    /**
     * <code>optional string textStartsWith = 2;</code>
     */
    var textStartsWith: kotlin.String
      @JvmName("getTextStartsWith")
      get() = _builder.getTextStartsWith()
      @JvmName("setTextStartsWith")
      set(value) {
        _builder.setTextStartsWith(value)
      }
    /**
     * <code>optional string textStartsWith = 2;</code>
     */
    fun clearTextStartsWith() {
      _builder.clearTextStartsWith()
    }
    /**
     * <code>optional string textStartsWith = 2;</code>
     * @return Whether the textStartsWith field is set.
     */
    fun hasTextStartsWith(): kotlin.Boolean {
      return _builder.hasTextStartsWith()
    }

    /**
     * <code>optional string textContains = 3;</code>
     */
    var textContains: kotlin.String
      @JvmName("getTextContains")
      get() = _builder.getTextContains()
      @JvmName("setTextContains")
      set(value) {
        _builder.setTextContains(value)
      }
    /**
     * <code>optional string textContains = 3;</code>
     */
    fun clearTextContains() {
      _builder.clearTextContains()
    }
    /**
     * <code>optional string textContains = 3;</code>
     * @return Whether the textContains field is set.
     */
    fun hasTextContains(): kotlin.Boolean {
      return _builder.hasTextContains()
    }

    /**
     * <code>optional string className = 4;</code>
     */
    var className: kotlin.String
      @JvmName("getClassName")
      get() = _builder.getClassName()
      @JvmName("setClassName")
      set(value) {
        _builder.setClassName(value)
      }
    /**
     * <code>optional string className = 4;</code>
     */
    fun clearClassName() {
      _builder.clearClassName()
    }
    /**
     * <code>optional string className = 4;</code>
     * @return Whether the className field is set.
     */
    fun hasClassName(): kotlin.Boolean {
      return _builder.hasClassName()
    }

    /**
     * <code>optional string contentDescription = 5;</code>
     */
    var contentDescription: kotlin.String
      @JvmName("getContentDescription")
      get() = _builder.getContentDescription()
      @JvmName("setContentDescription")
      set(value) {
        _builder.setContentDescription(value)
      }
    /**
     * <code>optional string contentDescription = 5;</code>
     */
    fun clearContentDescription() {
      _builder.clearContentDescription()
    }
    /**
     * <code>optional string contentDescription = 5;</code>
     * @return Whether the contentDescription field is set.
     */
    fun hasContentDescription(): kotlin.Boolean {
      return _builder.hasContentDescription()
    }

    /**
     * <code>optional string contentDescriptionStartsWith = 6;</code>
     */
    var contentDescriptionStartsWith: kotlin.String
      @JvmName("getContentDescriptionStartsWith")
      get() = _builder.getContentDescriptionStartsWith()
      @JvmName("setContentDescriptionStartsWith")
      set(value) {
        _builder.setContentDescriptionStartsWith(value)
      }
    /**
     * <code>optional string contentDescriptionStartsWith = 6;</code>
     */
    fun clearContentDescriptionStartsWith() {
      _builder.clearContentDescriptionStartsWith()
    }
    /**
     * <code>optional string contentDescriptionStartsWith = 6;</code>
     * @return Whether the contentDescriptionStartsWith field is set.
     */
    fun hasContentDescriptionStartsWith(): kotlin.Boolean {
      return _builder.hasContentDescriptionStartsWith()
    }

    /**
     * <code>optional string contentDescriptionContains = 7;</code>
     */
    var contentDescriptionContains: kotlin.String
      @JvmName("getContentDescriptionContains")
      get() = _builder.getContentDescriptionContains()
      @JvmName("setContentDescriptionContains")
      set(value) {
        _builder.setContentDescriptionContains(value)
      }
    /**
     * <code>optional string contentDescriptionContains = 7;</code>
     */
    fun clearContentDescriptionContains() {
      _builder.clearContentDescriptionContains()
    }
    /**
     * <code>optional string contentDescriptionContains = 7;</code>
     * @return Whether the contentDescriptionContains field is set.
     */
    fun hasContentDescriptionContains(): kotlin.Boolean {
      return _builder.hasContentDescriptionContains()
    }

    /**
     * <code>optional string resourceId = 8;</code>
     */
    var resourceId: kotlin.String
      @JvmName("getResourceId")
      get() = _builder.getResourceId()
      @JvmName("setResourceId")
      set(value) {
        _builder.setResourceId(value)
      }
    /**
     * <code>optional string resourceId = 8;</code>
     */
    fun clearResourceId() {
      _builder.clearResourceId()
    }
    /**
     * <code>optional string resourceId = 8;</code>
     * @return Whether the resourceId field is set.
     */
    fun hasResourceId(): kotlin.Boolean {
      return _builder.hasResourceId()
    }

    /**
     * <code>optional uint32 instance = 9;</code>
     */
    var instance: kotlin.Int
      @JvmName("getInstance")
      get() = _builder.getInstance()
      @JvmName("setInstance")
      set(value) {
        _builder.setInstance(value)
      }
    /**
     * <code>optional uint32 instance = 9;</code>
     */
    fun clearInstance() {
      _builder.clearInstance()
    }
    /**
     * <code>optional uint32 instance = 9;</code>
     * @return Whether the instance field is set.
     */
    fun hasInstance(): kotlin.Boolean {
      return _builder.hasInstance()
    }

    /**
     * <code>optional bool enabled = 10;</code>
     */
    var enabled: kotlin.Boolean
      @JvmName("getEnabled")
      get() = _builder.getEnabled()
      @JvmName("setEnabled")
      set(value) {
        _builder.setEnabled(value)
      }
    /**
     * <code>optional bool enabled = 10;</code>
     */
    fun clearEnabled() {
      _builder.clearEnabled()
    }
    /**
     * <code>optional bool enabled = 10;</code>
     * @return Whether the enabled field is set.
     */
    fun hasEnabled(): kotlin.Boolean {
      return _builder.hasEnabled()
    }

    /**
     * <code>optional bool focused = 11;</code>
     */
    var focused: kotlin.Boolean
      @JvmName("getFocused")
      get() = _builder.getFocused()
      @JvmName("setFocused")
      set(value) {
        _builder.setFocused(value)
      }
    /**
     * <code>optional bool focused = 11;</code>
     */
    fun clearFocused() {
      _builder.clearFocused()
    }
    /**
     * <code>optional bool focused = 11;</code>
     * @return Whether the focused field is set.
     */
    fun hasFocused(): kotlin.Boolean {
      return _builder.hasFocused()
    }

    /**
     * <code>optional string pkg = 12;</code>
     */
    var pkg: kotlin.String
      @JvmName("getPkg")
      get() = _builder.getPkg()
      @JvmName("setPkg")
      set(value) {
        _builder.setPkg(value)
      }
    /**
     * <code>optional string pkg = 12;</code>
     */
    fun clearPkg() {
      _builder.clearPkg()
    }
    /**
     * <code>optional string pkg = 12;</code>
     * @return Whether the pkg field is set.
     */
    fun hasPkg(): kotlin.Boolean {
      return _builder.hasPkg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.patrol_next.contracts.Contracts.Selector.copy(block: pl.leancode.patrol_next.contracts.SelectorKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol_next.contracts.Contracts.Selector =
  pl.leancode.patrol_next.contracts.SelectorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
