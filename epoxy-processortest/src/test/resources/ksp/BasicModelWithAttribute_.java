package com.airbnb.epoxy;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Generated file. Do not modify!
 */
public class BasicModelWithAttribute_ extends BasicModelWithAttribute implements GeneratedModel<Object>, BasicModelWithAttributeBuilder {
  private OnModelBoundListener<BasicModelWithAttribute_, Object> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<BasicModelWithAttribute_, Object> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<BasicModelWithAttribute_, Object> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<BasicModelWithAttribute_, Object> onModelVisibilityChangedListener_epoxyGeneratedModel;

  public BasicModelWithAttribute_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final Object object, final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void handlePostBind(final Object object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public BasicModelWithAttribute_ onBind(
      OnModelBoundListener<BasicModelWithAttribute_, Object> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(Object object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public BasicModelWithAttribute_ onUnbind(
      OnModelUnboundListener<BasicModelWithAttribute_, Object> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final Object object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public BasicModelWithAttribute_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<BasicModelWithAttribute_, Object> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final Object object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public BasicModelWithAttribute_ onVisibilityChanged(
      OnModelVisibilityChangedListener<BasicModelWithAttribute_, Object> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public BasicModelWithAttribute_ value(int value) {
    onMutation();
    super.value = value;
    return this;
  }

  public int value() {
    return value;
  }

  @Override
  public BasicModelWithAttribute_ id(long p0) {
    super.id(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ id(@Nullable Number... p0) {
    super.id(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ id(long p0, long p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ id(@Nullable CharSequence p0) {
    super.id(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ id(@Nullable CharSequence p0, @Nullable CharSequence... p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ id(@Nullable CharSequence p0, long p1) {
    super.id(p0, p1);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ layout(@LayoutRes int p0) {
    super.layout(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback p0) {
    super.spanSizeOverride(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ show() {
    super.show();
    return this;
  }

  @Override
  public BasicModelWithAttribute_ show(boolean p0) {
    super.show(p0);
    return this;
  }

  @Override
  public BasicModelWithAttribute_ hide() {
    super.hide();
    return this;
  }

  @Override
  public BasicModelWithAttribute_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    super.value = 0;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof BasicModelWithAttribute_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    BasicModelWithAttribute_ that = (BasicModelWithAttribute_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((value != that.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + value;
    return _result;
  }

  @Override
  public String toString() {
    return "BasicModelWithAttribute_{" +
        "value=" + value +
        "}" + super.toString();
  }
}
