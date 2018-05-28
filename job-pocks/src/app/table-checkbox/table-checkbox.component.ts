import { Component, OnInit } from '@angular/core';
import { tableCheckboxService } from './table-checkbox.service';

@Component({
  selector: 'app-table-checkbox',
  templateUrl: './table-checkbox.component.html',
  styleUrls: ['./table-checkbox.component.css']
})
export class TableCheckboxComponent implements OnInit {

  cols = [{
    field: 'nome', header: 'Nome'},
    {field: 'especialidade', header: 'Especialidade'},
    {field: 'docIdentificador', header: 'Documento Identificador'}
  ];
  prestadorSelecionado: any[] = [];
  prestadoresDisponiveis: any[] = []; 
  constructor(private checkService: tableCheckboxService) { }

  ngOnInit() {
    this.checkService.getPrestadoresLazyLoad('TP_MED', 0).subscribe((prestadores) => {
      this.prestadoresDisponiveis = prestadores;
    });
    }

  gerarCronograma_selecionarPrestador() {

  }
}
