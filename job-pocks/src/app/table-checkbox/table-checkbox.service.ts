import {
    Injectable
} from '@angular/core';
import {
    Http,
    Response
} from '@angular/http';
import 'rxjs/add/operator/map';
import {
    HttpClient,
    HttpResponse
} from '@angular/common/http';
import {
    Observable
} from 'rxjs/Observable';
@Injectable()
export class tableCheckboxService {

    urlPrestadores = 'http://demo4677424.mockable.io/prestadores';
    constructor(private http: HttpClient) { }
   
    getPrestadoresLazyLoad(chavePestador, paginador) {
     return this.http.get<any>(`${this.urlPrestadores}`);
     /*
      this.http.get<any>(`${this.urlPrestadores}/${chavePestador}/${paginador}`);
     */
    }
}
