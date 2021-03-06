//******************************************************************************
//                                       PropertyPostDTO.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 23 oct. 2018
// Contact: morgane.vidal@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package phis2ws.service.resources.dto.rdfResourceDefinition;

import io.swagger.annotations.ApiModelProperty;
import phis2ws.service.documentation.DocumentationAnnotation;
import phis2ws.service.resources.validation.interfaces.Required;

/**
 * The property DTO used for the post. It adds the @Required to the value param
 * @author Morgane Vidal <morgane.vidal@inra.fr>
 */
public class PropertyPostDTO extends PropertyDTO {
    
    @Required
    @ApiModelProperty(example = DocumentationAnnotation.EXAMPLE_PROPERTY_VALUE)
    @Override
    public String getValue() {
        return value;
    }
}
