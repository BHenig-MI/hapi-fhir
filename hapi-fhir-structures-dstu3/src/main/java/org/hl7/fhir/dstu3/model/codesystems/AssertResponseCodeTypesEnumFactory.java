package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Apr 17, 2017 17:38-0400 for FHIR v3.0.1


import org.hl7.fhir.dstu3.model.EnumFactory;

public class AssertResponseCodeTypesEnumFactory implements EnumFactory<AssertResponseCodeTypes> {

  public AssertResponseCodeTypes fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("okay".equals(codeString))
      return AssertResponseCodeTypes.OKAY;
    if ("created".equals(codeString))
      return AssertResponseCodeTypes.CREATED;
    if ("noContent".equals(codeString))
      return AssertResponseCodeTypes.NOCONTENT;
    if ("notModified".equals(codeString))
      return AssertResponseCodeTypes.NOTMODIFIED;
    if ("bad".equals(codeString))
      return AssertResponseCodeTypes.BAD;
    if ("forbidden".equals(codeString))
      return AssertResponseCodeTypes.FORBIDDEN;
    if ("notFound".equals(codeString))
      return AssertResponseCodeTypes.NOTFOUND;
    if ("methodNotAllowed".equals(codeString))
      return AssertResponseCodeTypes.METHODNOTALLOWED;
    if ("conflict".equals(codeString))
      return AssertResponseCodeTypes.CONFLICT;
    if ("gone".equals(codeString))
      return AssertResponseCodeTypes.GONE;
    if ("preconditionFailed".equals(codeString))
      return AssertResponseCodeTypes.PRECONDITIONFAILED;
    if ("unprocessable".equals(codeString))
      return AssertResponseCodeTypes.UNPROCESSABLE;
    throw new IllegalArgumentException("Unknown AssertResponseCodeTypes code '"+codeString+"'");
  }

  public String toCode(AssertResponseCodeTypes code) {
    if (code == AssertResponseCodeTypes.OKAY)
      return "okay";
    if (code == AssertResponseCodeTypes.CREATED)
      return "created";
    if (code == AssertResponseCodeTypes.NOCONTENT)
      return "noContent";
    if (code == AssertResponseCodeTypes.NOTMODIFIED)
      return "notModified";
    if (code == AssertResponseCodeTypes.BAD)
      return "bad";
    if (code == AssertResponseCodeTypes.FORBIDDEN)
      return "forbidden";
    if (code == AssertResponseCodeTypes.NOTFOUND)
      return "notFound";
    if (code == AssertResponseCodeTypes.METHODNOTALLOWED)
      return "methodNotAllowed";
    if (code == AssertResponseCodeTypes.CONFLICT)
      return "conflict";
    if (code == AssertResponseCodeTypes.GONE)
      return "gone";
    if (code == AssertResponseCodeTypes.PRECONDITIONFAILED)
      return "preconditionFailed";
    if (code == AssertResponseCodeTypes.UNPROCESSABLE)
      return "unprocessable";
    return "?";
  }

    public String toSystem(AssertResponseCodeTypes code) {
      return code.getSystem();
      }

}
