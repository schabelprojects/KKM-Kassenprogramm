import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VerkaufsprogrammComponent } from './verkaufsprogramm.component';

describe('VerkaufsprogrammComponent', () => {
  let component: VerkaufsprogrammComponent;
  let fixture: ComponentFixture<VerkaufsprogrammComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VerkaufsprogrammComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(VerkaufsprogrammComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
