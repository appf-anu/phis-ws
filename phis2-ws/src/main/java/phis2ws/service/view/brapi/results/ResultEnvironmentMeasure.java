//******************************************************************************
//                          ResultEnvironmentMeasure.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 7 nov. 2018
// Contact: vincent.migot@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package phis2ws.service.view.brapi.results;

import java.util.ArrayList;
import phis2ws.service.resources.dto.environment.EnvironmentMeasureDTO;
import phis2ws.service.view.brapi.Pagination;
import phis2ws.service.view.manager.Result;

/**
 * A class which represents the result part in the response form, adapted to the environment measures
 * @author Vincent Migot <vincent.migot@inra.fr>
 */
public class ResultEnvironmentMeasure extends Result<EnvironmentMeasureDTO> {
    /**
     * Constructor which calls the mother-class constructor in the case of a
     * list with only 1 element
     * @param measures 
     */
    public ResultEnvironmentMeasure(ArrayList<EnvironmentMeasureDTO> measures) {
        super(measures);
    }
    
    /**
     * Contructor which calls the mother-class constructor in the case of a
     * list with several elements
     * @param measures
     * @param pagination
     * @param paginate 
     */
    public ResultEnvironmentMeasure(ArrayList<EnvironmentMeasureDTO> measures, Pagination pagination, boolean paginate) {
        super(measures, pagination, paginate);
    }
}
