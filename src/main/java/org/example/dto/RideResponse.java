package org.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideResponse")
@Setter
@Getter
public class RideResponse {
    boolean accepted;
}
