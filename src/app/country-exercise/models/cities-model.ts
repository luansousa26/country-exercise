import { CountryModel } from "./country-model";

export class CitiesModel {
    
        id?: string;
        status?: string; 
        locationName?: string;
        parent?: CountryModel[];
        index?: number;
    }