/*
 * @author max
 */
package com.jetbrains.python.psi.impl.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.jetbrains.python.PyElementTypes;
import com.jetbrains.python.psi.PyClass;
import com.jetbrains.python.psi.stubs.PyClassStub;

public class PyClassStubImpl extends StubBase<PyClass> implements PyClassStub {
  private final String myName;

  public PyClassStubImpl(final String name, StubElement parentStub) {
    super(parentStub);
    myName = name;
  }

  public String getName() {
    return myName;
  }

  public IStubElementType getStubType() {
    return PyElementTypes.CLASS_DECLARATION;
  }
}