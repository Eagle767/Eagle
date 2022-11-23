package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class ShoeFactory {
	public ShoeFactory() {
		System.out.println("Hello........");
	}
}
abstract class Shoe {}

class VKC extends Shoe{
	public VKC() {
		System.out.println("VKC Brand is Ready.......");
	}
}

class Bata extends Shoe{
	public Bata() {
		System.out.println("Bata Brand is Ready.......");
	}
}
abstract class Factory{
	public abstract Shoe makeShoe();
}
@Component("lfactory")
class LeatherFactory extends Factory{
	public LeatherFactory() {
		System.out.println("Leather Factory is Ready.......");
	}
	@Override
	public Shoe makeShoe() {
		return new Bata();
	}}

class RubberFactory extends Factory{
	public RubberFactory() {
		System.out.println("Rubber Factory is Ready.......");
	}
    @Override
	public Shoe makeShoe() {
		return new VKC();
	}}
abstract class shop{
	@Autowired
	@Qualifier("lfactory")
	private Factory f;
	public void setFactory(Factory f) {
		this.f=f;
	}
	public Factory getFactory() {
		return f;
	}
	public abstract Shoe sellShoe();
} 
@Component("rajashop")
class RajashoeShop extends shop{
	public RajashoeShop() {
		System.out.println("Raja Shop is Ready.......");
	}
	@Override
	public Shoe sellShoe() {
		return getFactory().makeShoe();
	}}

class RoseshoeShop extends shop{
	public RoseshoeShop() {
		System.out.println("Rose Shop is Ready.......");
	}
	@Override
	public Shoe sellShoe() {
		return getFactory().makeShoe();
	}}