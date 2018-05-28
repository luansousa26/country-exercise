import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-table-primeng',
  templateUrl: './table-primeng.component.html',
  styleUrls: ['./table-primeng.component.css']
})
export class TablePrimengComponent implements OnInit {

  cars: any[];
  
      cols: any[];
  
      constructor() { }
  
      ngOnInit() {
          this.cars = [{
            vin: 'Repolho',
            year: 'Repolho',
            brand: 'Repolho',
            color: 'Repolho',
            price: 'Repolho',
            saleDate: 'Repolho'
          }]
      
          this.cols = [
              { field: 'vin', header: 'Vin' },
              { field: 'year', header: 'Year' },
              { field: 'brand', header: 'Brand' },
              { field: 'color', header: 'Color' }
          ];
        }
}
