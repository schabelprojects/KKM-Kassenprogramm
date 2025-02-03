import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MetaModule } from '../../services/meta.module';

@Component({
  selector: 'app-verkaufsprogramm',
  standalone: true,
  imports: [MetaModule],
  templateUrl: './verkaufsprogramm.component.html',
  styleUrl: './verkaufsprogramm.component.css'
})
export class VerkaufsprogrammComponent {

  constructor(private router: Router) {}

  navigateTo(path: string){
    this.router.navigate([path])
  };

}
