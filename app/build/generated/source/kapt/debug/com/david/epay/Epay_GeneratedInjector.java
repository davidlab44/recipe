package com.david.epay;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = Epay.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface Epay_GeneratedInjector {
  void injectEpay(Epay epay);
}
