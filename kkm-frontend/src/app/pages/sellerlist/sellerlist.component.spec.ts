import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SellerlistComponent } from './sellerlist.component';

describe('SellerlistComponent', () => {
  let component: SellerlistComponent;
  let fixture: ComponentFixture<SellerlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SellerlistComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SellerlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
