package jmck.gudetama.controller;

public abstract class BaseDAO<T>
{

	public abstract void delete(T object);

	public abstract T find(int id);

	public abstract void merge(T object);

	public abstract void persist(T object);

}
