package ir.m3.rahmani.studywithme.di

import dagger.Module
import ir.m3.rahmani.home_datastore.di.HomeDatastoreComponent

@Module(subcomponents = [HomeDatastoreComponent::class])
class HomeDatastoreModule